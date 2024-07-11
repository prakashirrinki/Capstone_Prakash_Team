import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { User } from '../Models/models/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private currentUserSubject: BehaviorSubject<User | null>;
  public currentUser: Observable<User | null>;
  getLoggedInUser: any;

  constructor(private router: Router) {
    this.currentUserSubject = new BehaviorSubject<User | null>(JSON.parse(localStorage.getItem('currentUser') || 'null'));
    this.currentUser = this.currentUserSubject.asObservable();
  }

  public get currentUserValue(): User | null {
    return this.currentUserSubject.value;
  }

  private getUsers(): User[] {
    return JSON.parse(localStorage.getItem('users') || '[]');
  }

  private setUsers(users: User[]): void {
    localStorage.setItem('users', JSON.stringify(users));
  }

  register(email: string, password: string, role: 'patient' | 'healthcare_provider' | 'insurance_company' | 'administrator', fullName: string, dateOfBirth: string, gender: string, mobileNumber: string): Observable<boolean> {
    const users = this.getUsers();
    if (users.some(u => u.email === email)) {
      console.log('User already exists');
      return of(false);
    }

    const newUser: User = {
      id: users.length + 1,
      email,
      password,
      role,
      fullName,
      dateOfBirth,
      gender,
      mobileNumber
    };

    users.push(newUser);
    this.setUsers(users);
    console.log('Registered users:', users);
    return of(true);
  }

  login(email: string, password: string): Observable<User | null> {
    console.log('Attempting login with:', email, password);
    const users = this.getUsers();
    console.log('Available users:', users);
    const user = users.find(u => u.email === email && u.password === password);
    if (user) {
      console.log('User found:', user);
      localStorage.setItem('currentUser', JSON.stringify(user));
      this.currentUserSubject.next(user);
      return of(user);
    }
    console.log('User not found');
    return of(null);
  }

  logout() {
    localStorage.removeItem('currentUser');
    this.currentUserSubject.next(null);
    this.router.navigate(['/login']);
  }

  isLoggedIn(): boolean {
    return !!this.currentUserValue;
  }
}