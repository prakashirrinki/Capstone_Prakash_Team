import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {
  private apiUrl = 'https://localhost:8080/api/invoice';

  constructor(private http: HttpClient) { }

  generateInvoice(invoiceData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/generate`, invoiceData);
  }

  getInvoiceDetails(invoiceId: string): Observable<any> {
    return this.http.get(`${this.apiUrl}/${invoiceId}`);
  }

  updateInvoiceStatus(invoiceId: string, status: string): Observable<any> {
    return this.http.put(`${this.apiUrl}/${invoiceId}/status`, { status });
  }
  sendInvoice(invoiceData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/send-invoice`, invoiceData);
  }
}