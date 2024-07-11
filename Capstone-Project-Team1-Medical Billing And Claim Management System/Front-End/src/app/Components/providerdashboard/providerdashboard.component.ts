import { Component, OnInit } from '@angular/core';
import { ProviderService } from '../../Services/providerservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-provider-dashboard',
  templateUrl: './providerdashboard.component.html',
  styleUrls: ['./providerdashboard.component.css']
})
export class ProviderDashboardComponent implements OnInit {
  providerInfo: any;
  recentInvoices: any[] = [];

  constructor(private providerService: ProviderService, private router: Router) { }

  ngOnInit() {
    this.loadProviderInfo();
    this.loadRecentInvoices();
  }

  loadProviderInfo() {
    this.providerService.getProviderInfo().subscribe(
      info => this.providerInfo = info,
      error => console.error('Error loading provider info:', error)
    );
  }

  loadRecentInvoices() {
    this.providerService.getRecentInvoices().subscribe(
      invoices => this.recentInvoices = invoices,
      error => console.error('Error loading recent invoices:', error)
    );
  }

  generateNewInvoice() {
   this.router.navigate(['/invoicegeneration']);
  }
}