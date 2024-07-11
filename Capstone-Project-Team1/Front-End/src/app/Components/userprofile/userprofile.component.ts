import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../../Services/userservice.service'; // Replace with your actual UserService import

@Component({
  selector: 'app-user-profile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserProfileComponent implements OnInit {
  userForm!: FormGroup; // Initialize directly, TypeScript knows it will be assigned in constructor
  userDetails: any;

  constructor(
    private fb: FormBuilder,
    private userService: UserService
  ) {}

  ngOnInit() {
    this.userForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', Validators.required],
      address: ['', Validators.required]
    });

    this.loadUserDetails();
  }

  loadUserDetails() {
    this.userService.getUserDetails().subscribe(
      details => {
        this.userDetails = details;
        this.userForm.patchValue(details); // Ensure details match FormGroup structure
      },
      error => {
        console.error('Error loading user details:', error);
      }
    );
  }

  onSubmit() {
    if (this.userForm && this.userForm.valid) {
      this.userService.updateUserDetails(this.userForm.value).subscribe(
        result => {
          console.log('User profile updated:', result);
          // Handle success (e.g., show success message)
        },
        error => {
          console.error('Error updating user profile:', error);
          // Handle error (e.g., show error message)
        }
      );
    }
  }
}
