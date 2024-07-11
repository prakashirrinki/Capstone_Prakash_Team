import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DataService } from 'src/app/Services/dataservice.service';
import { Router } from '@angular/router';

interface ClaimDetails {
  status: string;
  // Add other properties as needed
}

@Component({
  selector: 'app-claim-processing',
  templateUrl: './claimprocessing.component.html',
  styleUrls: ['./claimprocessing.component.css']
})
export class ClaimProcessingComponent implements OnInit {
  claimForm: FormGroup;
  claimDetails: ClaimDetails = { status: 'Pending' };

  constructor(
    private fb: FormBuilder,
    private dataService: DataService,
    private router: Router
  ) {
    this.claimForm = this.fb.group({
      patientName: ['', Validators.required],
      dateOfService: ['', Validators.required],
      diagnosis: ['', Validators.required],
      treatment: ['', Validators.required],
      claimAmount: ['', [Validators.required, Validators.min(0)]]
    });
  }

  ngOnInit(): void {
    // Fetch claim details if needed
    // this.fetchClaimDetails();
  }

  onSubmit(): void {
    if (this.claimForm.valid) {
      const formData = new FormData();

      Object.keys(this.claimForm.controls).forEach(key => {
        formData.append(key, this.claimForm.get(key)!.value);
      });

      this.dataService.submitClaim(formData).subscribe({
        next: () => {
          console.log('Claim submitted successfully');
          this.router.navigate(['/dashboard']);
        },
        error: (error) => {
          console.error('Error submitting claim:', error);
          // Handle error as needed
        }
      });
    } else {
      console.error('Form is invalid. Please fill all required fields.');
    }
  }

  approveClaim(): void {
    // Implement the logic for approving a claim
    console.log('Claim approved');
    this.claimDetails.status = 'Approved';
    // You might want to call a service method to update the claim status
  }

  rejectClaim(): void {
    // Implement the logic for rejecting a claim
    console.log('Claim rejected');
    this.claimDetails.status = 'Rejected';
    // You might want to call a service method to update the claim status
  }

  // fetchClaimDetails(): void {
  //   Implement this method to fetch claim details from your service
  //   this.dataService.getClaimDetails().subscribe(
  //     (details) => {
  //       this.claimDetails = details;
  //     },
  //     (error) => {
  //       console.error('Error fetching claim details:', error);
  //     }
  //   );
  // }
}