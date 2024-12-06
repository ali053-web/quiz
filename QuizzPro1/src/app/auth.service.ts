import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { User } from './user';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private apiUrl = 'http://localhost:8199/utilisateurs'; // Remplacez par votre URL API

  constructor(private http: HttpClient) {}


  login(email: string, password: string): Observable<any> {
    const loginData = { email, password };
    return this.http.post(`${this.apiUrl}/login`, loginData);
  }

    // Method to get user by ID
    getUserById(id: number): Observable<User> {
      return this.http.get<User>(`${this.apiUrl}/${id}`);
    }
}




