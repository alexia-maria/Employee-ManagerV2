import {Component, OnInit} from '@angular/core';
import {Task} from "../model/task";
import {TaskServiceService} from "../service/task-service.service";
import {RouterLink, RouterOutlet} from "@angular/router";

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [
    RouterLink,
    RouterOutlet
  ],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent implements OnInit{

  tasks: Task[] = [];

  constructor(private taskService: TaskServiceService) {
  }

  ngOnInit() {
    this.getTasks();
  }

  getTasks(){
    this.taskService.findAll().subscribe((data: Task[]) => {
      this.tasks = data;
    })
  }

  addTask(task: Task){
    this.taskService.save(task);
  }
}
