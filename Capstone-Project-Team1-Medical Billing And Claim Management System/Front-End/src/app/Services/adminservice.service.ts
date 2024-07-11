import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { InsuranceCompanyEntity } from '../Models/insurance-company-entity';
import { HealthCareProviderEntity } from '../Models/health-care-provider-entity';
import { PatientEntity } from '../Models/patient-entity';
import { AdministratorEntity } from '../Models/administrator-entity';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private apiUrl = 'http://localhost:8080/api/admin'; 

  constructor(private http: HttpClient) { }

  // getUsers(): Observable<any[]> {
  //   return this.http.get<any[]>(`${this.apiUrl}/users`);
  // }

  // getHealthcareProviders(): Observable<any[]> {
  //   return this.http.get<any[]>(`${this.apiUrl}/provider`);
  // }

  // getInsuranceCompanies(): Observable<any[]> {
  //   return this.http.get<any[]>(`${this.apiUrl}/plans`);
  // }

  // getClaimHistory(): Observable<any[]> {
  //   return this.http.get<any[]>(`${this.apiUrl}/claims`);
  // }

  getAll():Observable<AdministratorEntity[]>{

    return this.http.get<AdministratorEntity[]>(this.apiUrl+"/getAll");


}


  getPatients(): Observable<PatientEntity[]> {
    return this.http.get<PatientEntity[]>(this.apiUrl+"/getAllPatients");
  }

  getProviders(): Observable<HealthCareProviderEntity[]> {
    return this.http.get<HealthCareProviderEntity[]>(this.apiUrl+"/getAllProviders");
  }

  getCompanies(): Observable<InsuranceCompanyEntity[]> {
    return this.http.get<InsuranceCompanyEntity[]>(this.apiUrl+"/getAllCompanies");
  }
}