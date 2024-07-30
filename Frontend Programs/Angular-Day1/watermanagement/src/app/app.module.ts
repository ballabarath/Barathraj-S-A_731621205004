import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';

import { RightComponent } from './right/right.component';
import { TopComponent } from './top/top.component';
import { EmsService } from './ems.service';

@NgModule({
  declarations: [
    AppComponent,
   
    RightComponent,
 
    TopComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [EmsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
