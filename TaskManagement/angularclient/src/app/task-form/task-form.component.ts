import { Component } from '@angular/core';
import {Task} from "../model/task";
import {ActivatedRoute, Router} from "@angular/router";
import {TaskServiceService} from "../service/task-service.service";

@Component({
  selector: 'app-task-form',
  standalone: true,
  imports: [],
  templateUrl: './task-form.component.html',
  styleUrl: './task-form.component.css'
})
export class TaskFormComponent {
  task: Task;

  constructor(private route: ActivatedRoute, private router: Router, private taskService: TaskServiceService) {
    this.task = new Task();
  }

  onSumbit(){
    this.taskService.save(this.task).subscribe(result =>
    this.gotoTaskList());
  }

  gotoTaskList(){
    this.router.navigate(['tasks']);
  }
}
