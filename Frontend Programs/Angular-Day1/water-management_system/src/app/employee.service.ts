import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private employeesSubject: BehaviorSubject<Employee[]> = new BehaviorSubject<Employee[]>([
    { id: 101, name: 'Kavin', salary: 2800 },
    { id: 102, name: 'Barath', salary: 3040 },
    { id: 103, name: 'Yogi', salary: 2220 },
    { id: 104, name: 'Vijay', salary: 3020 },
    { id: 105, name: 'Yuva', salary: 4220 }
  ]);

  getEmployees(): Observable<Employee[]> {
    return this.employeesSubject.asObservable();
  }

  addEmployee(employee: Employee) {
    const currentEmployees = this.employeesSubject.value;
    this.employeesSubject.next([...currentEmployees, { ...employee }]);
  }

  updateEmployee(employee: Employee) {
    const currentEmployees = this.employeesSubject.value;
    const index = currentEmployees.findIndex(e => e.id === employee.id);
    if (index !== -1) {
      currentEmployees[index] = { ...employee };
      this.employeesSubject.next([...currentEmployees]);
    }
  }

  deleteEmployee(id: number) {
    const currentEmployees = this.employeesSubject.value.filter(e => e.id !== id);
    this.employeesSubject.next(currentEmployees);
  }
}

interface Employee {
  id: number;
  name: string;
  salary: number;
}
