import { Component } from '@angular/core';

interface Employee {
  id: number;
  name: string;
  salary: number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employees: Employee[] = [
    { id: 101, name: 'Kavin', salary: 2800 },
    { id: 102, name: 'Barath', salary: 3040 },
    { id: 103, name: 'Yogi', salary: 2220 },
    { id: 104, name: 'Vijay', salary: 3020 },
    { id: 105, name: 'Yuva', salary: 4220 }
  ];
  employee: Employee = { id: 0, name: '', salary: 0 };
  message: string = '';

  saveEmployee() {
    this.employees.push({ ...this.employee });
    this.message = `Record ${this.employee.id} Saved`;
    this.clearEmployee();
  }

  updateEmployee() {
    const index = this.employees.findIndex(e => e.id === this.employee.id);
    if (index !== -1) {
      this.employees[index] = { ...this.employee };
      this.message = `Record ${this.employee.id} Updated`;
    } else {
      this.message = `Record ${this.employee.id} Not Found`;
    }
    this.clearEmployee();
  }

  deleteEmployee() {
    this.employees = this.employees.filter(e => e.id !== this.employee.id);
    this.message = `Record ${this.employee.id} Deleted`;
    this.clearEmployee();
  }

  clearEmployee() {
    this.employee = { id: 0, name: '', salary: 0 };
  }
}
