import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SigninComponent } from './signin/signin.component';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    UtilisateurComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
