import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SigninComponent } from './signin/signin.component';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';

const routes: Routes = [
  { path: 'login', component: SigninComponent },
  { path: 'utilisateur/:id', component: UtilisateurComponent }, // Route with ID parameter
  { path: '', redirectTo: '/login', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)], // Configuration principale des routes
  exports: [RouterModule] // Exportation pour utilisation dans l'application
})
export class AppRoutingModule { }
