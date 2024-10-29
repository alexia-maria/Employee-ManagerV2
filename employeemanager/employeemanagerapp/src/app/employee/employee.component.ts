import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

import {EmployeeService} from "../service/employee.service";
import {HttpErrorResponse} from "@angular/common/http";
import {NgForOf} from "@angular/common";
import { CommonModule } from "@angular/common";
import {type Employee} from "./employee.model";
import {EditEmployeeComponent} from "./edit-employee/edit-employee.component";

@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [
    NgForOf,
    CommonModule,
    EditEmployeeComponent
  ],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent{

  @Input({required: true}) employee!: Employee;

  @Input({required: true}) selected!: boolean;

  @Output() edit = new EventEmitter<number>();

  @Output() delete = new EventEmitter<number>();

  constructor(private employeeService: EmployeeService) {
  }

  onEditEmployee(){
    this.edit.emit(this.employee.id);
  }

  onDeleteEmployee(){
    this.delete.emit(this.employee.id);
  }
}
