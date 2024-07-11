import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClaimService {
  private apiUrl = 'https://localhost:8080/api/claims';
  claimForm: any[] = [];
  getClaimHistory: any;

  constructor(private http: HttpClient) { }

  submitClaim(claimData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/submit`, claimData);
  }

  getClaimDetails(claimId: string): Observable<any> {
    return this.http.get(`${this.apiUrl}/${claimId}`);
  }

  approveClaim(claimId: string): Observable<any> {
    return this.http.put(`${this.apiUrl}/${claimId}/approve`, {});
  }

  rejectClaim(claimId: string): Observable<any> {
    return this.http.put(`${this.apiUrl}/${claimId}/reject`, {});
  }
}