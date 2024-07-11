import { Component, OnInit } from '@angular/core';
import { InsuranceService } from '../../Services/insuranceservice.service';

@Component({
  selector: 'app-insurance-company-dashboard',
  templateUrl: './insurancecompanydashboard.component.html',
  styleUrls: ['./insurancecompanydashboard.component.css']
})
export class InsuranceCompanyDashboardComponent implements OnInit {
  companyInfo: any;
  pendingClaims: any[] = [];

  constructor(private insuranceService: InsuranceService) { }

  ngOnInit() {
    this.loadCompanyInfo();
    this.loadPendingClaims();
  }

  loadCompanyInfo() {
    this.insuranceService.getCompanyInfo().subscribe(
      info => this.companyInfo = info,
      error => console.error('Error loading company info:', error)
    );
  }

  loadPendingClaims() {
    this.insuranceService.getPendingClaims().subscribe(
      claims => this.pendingClaims = claims,
      error => console.error('Error loading pending claims:', error)
    );
  }

  processClaim(claimId: string) {
    // Navigate to claim processing page
  }
}