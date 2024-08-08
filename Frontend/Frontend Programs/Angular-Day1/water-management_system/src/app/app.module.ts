import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { CenterComponent } from './center/center.component';
import { RightComponent } from './right/right.component';
import { EmployeeService } from './employee.service';
import { TopComponent } from './top/top.component';

@NgModule({
  declarations: [
    AppComponent,
    CenterComponent,
    RightComponent,
    TopComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
