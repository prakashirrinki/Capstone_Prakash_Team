// data.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private baseUrl = 'http://localhost:8080/api/admin'; 

  constructor(private http: HttpClient) { }

  getUsers(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/users`);
  }

  getProviders(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/providers`);
  }

  getCompanies(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/companies`);
  }

  getClaims(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/claims`);
  }
  submitClaim(formData: FormData): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/submit-claim`, formData);
  }

}
