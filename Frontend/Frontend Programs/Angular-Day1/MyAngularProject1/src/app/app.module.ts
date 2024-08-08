import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { CalculatorService } from './calculator.service';

const ROUTES: Routes = [
  {path : 'home', component : HomeComponent},
  {path : 'about', component : AboutComponent},
  {path : 'contact', component : ContactComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [CalculatorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
