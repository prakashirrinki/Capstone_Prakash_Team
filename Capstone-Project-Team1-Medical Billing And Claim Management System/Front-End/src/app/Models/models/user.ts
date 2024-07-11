export interface User {
  id?: number;
  email: string;
  password: string;
  role: 'patient' | 'healthcare_provider' | 'insurance_company' | 'administrator';
  fullName: string;
  dateOfBirth: string;
  gender: string;
  mobileNumber: string;
}