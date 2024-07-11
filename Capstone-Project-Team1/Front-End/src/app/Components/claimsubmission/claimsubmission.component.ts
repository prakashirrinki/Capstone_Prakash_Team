import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { DataService } from 'src/app/Services/dataservice.service';

@Component({
  selector: 'app-claim-submission',
  templateUrl: './claimsubmission.component.html',
  styleUrls: ['./claimsubmission.component.css']
})
export class ClaimSubmissionComponent implements OnInit {
  claimForm!: FormGroup;
  attachments: File[] = [];
  maxFileSize = 5 * 1024 * 1024; // 5MB

  constructor(
    private fb: FormBuilder,
    private dataService: DataService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.initForm();
  }

  initForm(): void {
    this.claimForm = this.fb.group({
      patientName: ['', [Validators.required, Validators.minLength(2), Validators.maxLength(50)]],
      dateOfService: ['', [Validators.required, this.dateValidator]],
      diagnosis: ['', [Validators.required, Validators.minLength(5), Validators.maxLength(100)]],
      treatment: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(500)]],
      claimAmount: ['', [Validators.required, Validators.min(0), Validators.max(1000000)]]
    });
  }

  dateValidator(control: AbstractControl): {[key: string]: any} | null {
    const today = new Date();
    const inputDate = new Date(control.value);
    if (inputDate > today) {
      return { 'futureDate': true };
    }
    return null;
  }

  onSubmit(): void {
    if (this.claimForm.valid) {
      this.router.navigate(['/claimprocessing']);
    } else {
      this.markFormGroupTouched(this.claimForm);
    }
  }

  onFileSelected(event: Event): void {
    const element = event.currentTarget as HTMLInputElement;
    let fileList: FileList | null = element.files;
    if (fileList) {
      this.attachments = Array.from(fileList).filter(file => file.size <= this.maxFileSize);
      if (this.attachments.length !== fileList.length) {
        // Some files were too large
        alert('Files larger than 5MB have been removed.');
      }
    }
  }

  markFormGroupTouched(formGroup: FormGroup) {
    Object.values(formGroup.controls).forEach(control => {
      control.markAsTouched();
      if (control instanceof FormGroup) {
        this.markFormGroupTouched(control);
      }
    });
  }

  // Getter methods for easy access in template
  get patientName() { return this.claimForm.get('patientName'); }
  get dateOfService() { return this.claimForm.get('dateOfService'); }
  get diagnosis() { return this.claimForm.get('diagnosis'); }
  get treatment() { return this.claimForm.get('treatment'); }
  get claimAmount() { return this.claimForm.get('claimAmount'); }
}