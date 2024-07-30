// src/app/center/center.component.ts
import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { EmsService } from '../ems.service';

@Component({
  selector: 'center',
  templateUrl: './center.component.html',
  styleUrls: ['./center.component.css']
})
export class CenterComponent {
  myForm: FormGroup;
  result: string = '';
  employee = { id: '', name: '', salary: '' };

  constructor(private service: EmsService) {
    this.myForm = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      salary: new FormControl('')
    });
  }

  saveEmployee(data: any): void {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;
    this.service.saveEmployee(this.employee);
    this.result = this.service.result;
  }

  updateEmployee(data: any): void {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;
    this.service.updateEmployee(this.employee);
    this.result = this.service.result;
  }

  deleteEmployee(data: any): void {
    this.service.deleteEmployee(data.id);
    this.result = this.service.result;
  }
}
