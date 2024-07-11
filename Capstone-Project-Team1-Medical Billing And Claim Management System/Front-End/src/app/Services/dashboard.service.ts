// dashboard.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  private apiUrl = 'http://localhost:8080/api/dashboard'; 

  constructor(private http: HttpClient) { }

  getClaims(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/claims`);
  }

  getPayments(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/payments`);
  }

  getClaimById(id: string): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/claims/${id}`);
  }

  getPaymentById(id: string): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/payments/${id}`);
  }

  getClaimsPaginated(page: number, pageSize: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/claims?page=${page}&pageSize=${pageSize}`);
  }

  getPaymentsPaginated(page: number, pageSize: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/payments?page=${page}&pageSize=${pageSize}`);
  }
}