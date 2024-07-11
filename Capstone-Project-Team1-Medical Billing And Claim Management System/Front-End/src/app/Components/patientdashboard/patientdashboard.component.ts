import { Component, OnInit } from '@angular/core';
import { PatientService } from '../../Services/patientservice.service';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-patient-dashboard',
  templateUrl: './patientdashboard.component.html',
  styleUrls: ['./patientdashboard.component.css']
})
export class PatientDashboard implements OnInit {
  patientInfo: any;
  recentClaims: any[] = [];
  insurancePlan: any;
  claimForm!: FormGroup;

  constructor(private patientService: PatientService, private router: Router) { 
    this.insurancePlan = {
      name: 'Basic Plan',
      coverage: 'Basic coverage details'
    };
  }

  ngOnInit() {
    this.loadPatientInfo();
    this.loadRecentClaims();
  }

  loadPatientInfo() {
    this.patientService.getPatientInfo().subscribe(
      info => this.patientInfo = info,
      error => console.error('Error loading patient info:', error)
    );
  }

  loadRecentClaims() {
    this.patientService.getRecentClaims().subscribe(
      claims => this.recentClaims = claims,
      error => console.error('Error loading recent claims:', error)
    );
  }

  submitClaim() {
    this.router.navigate(['/claimsubmission']);
  }
  viewInsurancePlans() {
    console.log('Viewing available insurance plans');
    this.router.navigate(['/insuranceplanselection']); 
  }
  editPersonalInfo() {
    console.log('Editing personal information');
  }
  markFormGroupTouched(formGroup: FormGroup) {
    Object.values(formGroup.controls).forEach(control => {
      control.markAsTouched();
      if (control instanceof FormGroup) {
        this.markFormGroupTouched(control);
      }
    });
  }
}