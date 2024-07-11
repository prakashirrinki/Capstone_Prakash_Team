import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private apiUrl = 'https://localhost:8080/api/patient';

  constructor(private http: HttpClient) { }

  getPatientInfo(): Observable<any> {
    return this.http.get(`${this.apiUrl}/info`);
  }

  getRecentClaims(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/claims/recent`);
  }

  updatePatientInfo(patientInfo: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/info`, patientInfo);
  }
}