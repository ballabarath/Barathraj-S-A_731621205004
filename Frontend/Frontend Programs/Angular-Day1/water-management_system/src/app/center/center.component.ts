import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-center',
  templateUrl: './center.component.html',
  styleUrls: ['./center.component.css']
})
export class CenterComponent {
  employee: Employee = { id: 0, name: '', salary: 0 };
  message: string = '';

  constructor(private employeeService: EmployeeService) {}

  saveEmployee() {
    this.employeeService.addEmployee(this.employee);
    this.message = `Record ${this.employee.id} Saved`;
    this.clearEmployee();
  }

  updateEmployee() {
    this.employeeService.updateEmployee(this.employee);
    this.message = `Record ${this.employee.id} Updated`;
    this.clearEmployee();
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employee.id);
    this.message = `Record ${this.employee.id} Deleted`;
    this.clearEmployee();
  }

  clearEmployee() {
    this.employee = { id: 0, name: '', salary: 0 };
  }
}

interface Employee {
  id: number;
  name: string;
  salary: number;
}
