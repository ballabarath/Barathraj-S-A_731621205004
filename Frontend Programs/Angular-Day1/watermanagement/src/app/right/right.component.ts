import { Component, OnInit } from '@angular/core';
import { EmsService } from '../ems.service';

@Component({
  selector: 'right',
  templateUrl: './right.component.html',
  styleUrls: ['./right.component.css']
})
export class RightComponent implements OnInit {
  allEmployeesList: any = [];

  constructor(private service: EmsService) {}

  ngOnInit(): void {
    this.getAllEmployeeDetails();
  }

  getAllEmployeeDetails(): void {
    this.service.getAllEmployeeDetails().subscribe(res => this.allEmployeesList = res);
  }
}
