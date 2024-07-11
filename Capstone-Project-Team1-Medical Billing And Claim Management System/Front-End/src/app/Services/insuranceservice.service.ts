import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InsuranceService {
  private apiUrl = 'https://localhost:8080/api/plans';

  constructor(private http: HttpClient) { }

  getCompanyInfo(): Observable<any> {
    return this.http.get(`${this.apiUrl}/company-info`);
  }

  getPendingClaims(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/claims/pending`);
  }

  getInsurancePlans(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/plans`);
  }

  selectInsurancePlan(planId: string): Observable<any> {
    return this.http.post(`${this.apiUrl}/plans/select`, { planId });
  }
}