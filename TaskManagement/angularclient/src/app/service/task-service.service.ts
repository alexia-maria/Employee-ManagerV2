import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Task} from "../model/task";

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {

  private taskUrl: string;
  constructor(private http: HttpClient) {
    this.taskUrl = 'http://localhost:8080/users';
  }

  public findAll(): Observable<Task[]>{
    return this.http.get<Task[]>(this.taskUrl);
  }

  public save(task: Task){
    return this.http.post<Task>(this.taskUrl, task);
  }
}
