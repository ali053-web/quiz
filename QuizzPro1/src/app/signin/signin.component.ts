import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css'],
})
export class SigninComponent {
  email: string = '';
  password: string = '';
  errorMessage: string = '';

  constructor(private authService: AuthService, private router: Router) {}
  onLogin(): void {
    this.authService.login(this.email, this.password).subscribe(
      (response) => {
        // Login successful, navigate to the UtilisateurComponent with user ID
        console.log('Login successful:', response);
        const userId = response.id; // Assuming response contains the user ID
console.log(userId)
        // Alert for login succesxs

        // Redirect to utilisateur component with user ID
        this.router.navigate(['utilisateur/', userId]);
      },
      (error) => {
        // Handle login failure
        this.errorMessage = 'Invalid email or password. Please try again.';
        console.error('Login failed:', error);

        // Alert for login failure
        alert('Login failed: Invalid email or password.');
      }
    );
  }
}
