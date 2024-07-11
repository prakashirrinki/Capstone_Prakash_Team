import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/Services/authservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  error: string = '';

  constructor(
    private formBuilder: FormBuilder,
    private authService: AuthService,
    private router: Router
  ) {
    this.loginForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    if (this.loginForm.valid) {
      const { email, password } = this.loginForm.value;
      console.log('Attempting login with:', email, password);
      this.authService.login(email, password).subscribe(
        user => {
          if (user) {
            console.log('Login successful:', user);
            this.router.navigate(['/dashboard']);
          } else {
            console.log('Login failed: user not found');
            this.error = 'Invalid email or password';
          }
        },
        error => {
          console.error('Login error:', error);
          this.error = 'An error occurred during login';
        }
      );
    } else {
      this.error = 'Please fill all fields correctly';
    }
  }
}