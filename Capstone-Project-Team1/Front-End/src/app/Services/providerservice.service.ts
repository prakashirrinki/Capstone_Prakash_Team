import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProviderService {
  private apiUrl = 'https://localhost:8080/api/provider';

  constructor(private http: HttpClient) { }

  getProviderInfo(): Observable<any> {
    return this.http.get(`${this.apiUrl}/info`);
  }

  getRecentInvoices(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/invoices/recent`);
  }

  updateProviderInfo(providerInfo: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/info`, providerInfo);
  }
}