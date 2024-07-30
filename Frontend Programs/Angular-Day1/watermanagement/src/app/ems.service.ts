// src/app/ems.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmsService {
  private messageSource = new BehaviorSubject<any>('');
  url: string = 'http://localhost:3004/posts';
  result: string = '';

  constructor(private http: HttpClient) {
    this.getAllEmployeeDetails();
  }

  getAllEmployeeDetails(): Observable<any> {
    return this.http.get(this.url).pipe(
      map((res: any) => {
        this.messageSource.next(res);
        return res;
      })
    );
  }

  saveEmployee(employee: any): void {
    this.http.post(this.url, employee).subscribe((res: any) => {
      this.result = `Record ${employee.id} Saved`;
      this.getAllEmployeeDetails();
    });
  }

  updateEmployee(employee: any): void {
    this.http.put(`${this.url}/${employee.id}`, employee).subscribe(() => {
      this.result = `Record ${employee.id} Updated`;
      this.getAllEmployeeDetails();
    });
  }

  deleteEmployee(id: any): void {
    this.http.delete(`${this.url}/${id}`).subscribe(() => {
      this.result = `Record ${id} Deleted`;
      this.getAllEmployeeDetails();
    });
  }
}
