
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AuthService } from '../auth.service';
import { User } from '../user';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {
  user: User | undefined;
  userId!: number; // ID of the user passed in the route

  constructor(
    private route: ActivatedRoute,
    private authService: AuthService
  ) {}

  ngOnInit(): void {
    // Get the user ID from the route parameters
    this.route.params.subscribe(params => {
      this.userId = +params['id']; // Get the 'id' parameter and convert to a number
      console.log('User ID:', this.userId);
      this.getUserData(this.userId); // Fetch user data based on the ID
    });
  }

  getUserData(id: number): void {
    this.authService.getUserById(id).subscribe(
      (user: User) => {
        this.user = user;
        console.log('User data:', this.user);
      },
      (error: any) => {
        console.error('Error fetching user data:', error);
      }
    );
  }
}
