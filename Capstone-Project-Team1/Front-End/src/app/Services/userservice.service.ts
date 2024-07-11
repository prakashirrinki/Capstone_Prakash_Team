import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { User } from '../Models/models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiUrl = 'https://localhost:8080/api/users';
  users: any;
  getUsers: any;

  constructor(private http: HttpClient) { }

  getUserDetails(): Observable<any> {
    return this.http.get(`${this.apiUrl}/profile`);
  }

  updateUserDetails(userDetails: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/profile`, userDetails);
  }

  changePassword(passwordData: { currentPassword: string, newPassword: string }): Observable<any> {
    return this.http.post(`${this.apiUrl}/change-password`, passwordData);
  }
  register(email: string, password: string, role: 'patient' | 'healthcare_provider' | 'insurance_company' | 'administrator'): Observable<boolean> {
    const newUser = {
      id: this.users.length + 1,
      email,
      password,
      role
    } as User;
  
    this.users.push(newUser);
    console.log('Registered users:', this.users); // For debugging
    return of(true);
  }
}