import {Component, EventEmitter, Input, Output} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {Employee} from "../employee.model";
import {EmployeeService} from "../../service/employee.service";

@Component({
  selector: 'app-edit-employee',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './edit-employee.component.html',
  styleUrl: './edit-employee.component.css'
})
export class EditEmployeeComponent {
  @Input() employee:Employee = { id: 0, name: '', email: '', jobTitle: '', phone: '', imageUrl: '', employeeCode: '' };
  @Input({required: true}) mode!: string;

  @Output() close = new EventEmitter<void>();
  @Output() save = new EventEmitter<Employee>();

  constructor(private employeeService: EmployeeService) {
  }

  onCancelCloseForm(){
    this.close.emit();
  }

  onEditModifyData(){

    this.employeeService.updateEmployee(this.employee).subscribe({
      next: (updatedEmployee) => {
          console.log('Employee updated successfully:', updatedEmployee);
          this.close.emit(); // Închide dialogul doar după ce modificarea a avut succes
        },
        error: (err) => {
          console.error('Error updating employee:', err);
          // Aici poți adăuga logică pentru a afișa un mesaj de eroare, dacă este necesar
        }
      });

    this.close.emit();
  }

  onSave(){
    this.employeeService.addEmployee(this.employee).subscribe({
      next: (savedEmployee) => {
        console.log('Employee saved successfully:', savedEmployee);
        this.save.emit(savedEmployee);
      },
      error: (err) => {
        console.error('Error updating employee:', err);
      }
    });

    this.close.emit();
  }
}
