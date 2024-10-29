import {Component, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Employee} from "./employee/employee.model";
import {EmployeeService} from "./service/employee.service";
import {response} from "express";
import {HttpErrorResponse} from "@angular/common/http";
import {NgForOf} from "@angular/common";
import {EmployeeComponent} from "./employee/employee.component";
import {HeaderComponent} from "./header/header.component";
import {EditEmployeeComponent} from "./employee/edit-employee/edit-employee.component";
import {AddEmployeeComponent} from "./employee/add-employee/new-employee.component";
import {SearchBarComponent} from "./search-bar/search-bar.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NgForOf, EmployeeComponent, HeaderComponent, EditEmployeeComponent, AddEmployeeComponent, SearchBarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  isEditing = false;
  isAdding = false;
  isSearching = false;
  edit: string = "edit";
  save: string = "save";
  public employees: Employee[] = [];
  public employeesSearch: Employee[] = [];

  selectedEmployeeId!: number;

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.getEmployees();
  }

  get selectedEmployee(){
    return this.employees.find(employee => employee.id === this.selectedEmployeeId)
  }

  public getEmployees(): void{
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
      },
      (error: HttpErrorResponse) => {
        console.log("eroare");
      }
    );
  }

  onEditModifyEmployees(){
    this.isEditing = true;
  }

  onCancelCloseFormParent(){
    this.selectedEmployeeId = 0;
  }

  onEditEmployeeParent(id: number){
    this.selectedEmployeeId = id;
  }

  onDeleteEmployeeParent(id: number){
    if(confirm("Are you sure you want to delete this employee?")){
      this.employeeService.deleteEmployee(id).subscribe({
        next: () => {
          this.employees = this.employees.filter(emp => emp.id !== id);
          console.log('Employee deleted successfully:');
        },
        error: (err) => {
          console.error('Error deleting employee:', err);
        }
      });
    }
  }

  onAddEmployeeParent(){
    this.isAdding = true;
  }

  onCancelCloseFormAdd(){
    this.isAdding = false;
  }

  onSaveModifyList(employee: Employee){
    console.log("here");
    this.employees.push(employee);
    this.isAdding = false;
  }

  onSearchParent(filter: string){
    console.log(filter);
    if(filter !== ''){
      this.employeeService.findEmployeesByName(filter).subscribe((data: Employee[]) => {
        this.employees = data;
      });
      console.log(this.employees);
    }else {
      this.employeeService.getEmployees().subscribe((data: Employee[]) => {
        this.employees = data;
      });
    }
  }
}

