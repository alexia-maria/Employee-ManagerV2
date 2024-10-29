import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-add-employee',
  standalone: true,
  imports: [],
  templateUrl: './new-employee.component.html',
  styleUrl: './new-employee.component.css'
})
export class AddEmployeeComponent {

  @Output() save = new EventEmitter<void>();

  onAddEmployee(){
    this.save.emit();
  }
}
