// admin-dashboard.component.ts

import { Component, OnInit } from '@angular/core';
import { AdministratorEntity } from 'src/app/Models/administrator-entity';
import { HealthCareProviderEntity } from 'src/app/Models/health-care-provider-entity';
import { InsuranceCompanyEntity } from 'src/app/Models/insurance-company-entity';
import { PatientEntity } from 'src/app/Models/patient-entity';
import { AdminService } from 'src/app/Services/adminservice.service';
import { DataService } from 'src/app/Services/dataservice.service';
import { ProviderService } from 'src/app/Services/providerservice.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdminDashboardComponent implements OnInit{

  patients: PatientEntity[] = [];
  admins: AdministratorEntity[] = [];
  providers: HealthCareProviderEntity[] = [];
  companies: InsuranceCompanyEntity[] = [];

  constructor(private adminService: AdminService,
    private provider:ProviderService
  ) { }
  ngOnInit(): void {
    this.getPatients();
    this.getProviders();
    this.getCompanies();
  }


  getAll(){
  
    this.adminService.getAll().subscribe( 
                              (list)=>{ this.admins = list;  console.log(list)}
                              
                                );
}

getAllproviders(){
  
  this.adminService.getProviders().subscribe( 
                            (list)=>{ this.providers = list}
                            
                              );
}

    getPatients(): void {
      this.adminService.getPatients().subscribe(
        patients => {
          this.patients = patients;
        }
      );
    }
  
    getProviders(): void {
      this.adminService.getProviders().subscribe(
        providers => {
          this.providers = providers;
        }
      );
    }
  
    getCompanies(): void {
      this.adminService.getCompanies().subscribe(
        companies => {
          this.companies = companies;
        }
      );
    }
}
