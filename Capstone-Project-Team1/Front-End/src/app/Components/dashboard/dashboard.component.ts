import { Component, OnInit } from '@angular/core';
import { DashboardService } from '../../Services/dashboard.service';
import { AuthService } from 'src/app/Services/authservice.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  claims: any[] = [];
  payments: any[] = [];
  currentUserRole: string = '';
  loggedInUser: { email: string } | null = null;
  

  constructor(private dashboardService: DashboardService , private authService: AuthService) {
    this.loggedInUser = this.authService.getLoggedInUser();
   }
   logout(): void {
    this.authService.logout();
    
  }

  ngOnInit(): void {
    const loggedInUser = this.authService.getLoggedInUser();
    if (loggedInUser) {
      this.currentUserRole = this.getRoleFromEmail(loggedInUser.email);
    }
    this.loadDashboardData();
  }
  private getRoleFromEmail(email: string): string {

    if (email === 'patient@gmail.com') {
      return 'patient';
    } else if (email === 'provider@gmail.com') {
      return 'provider';
    } else if (email === 'insurance@gmail.com') {
      return 'insurance';
    } else if (email === 'admin@gmail.com') {
      return 'admin';
    } else {
      return '';
    }
  }
  loadDashboardData(): void {
    this.dashboardService.getClaims().subscribe(
      (data) => {
        this.claims = data;
      },
      (error) => {
        console.error('Error fetching claims:', error);
      }
    );

    this.dashboardService.getPayments().subscribe(
      (data) => {
        this.payments = data;
      },
      (error) => {
        console.error('Error fetching payments:', error);
      }
    );
  }
}