import {Component, OnInit} from '@angular/core';
import {User} from "../model/user";
import { UserService } from '../service/user-service';
import {NgFor} from "@angular/common";


@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [NgFor],
  templateUrl: './user-list.component.html',
  styleUrl: './user-list.component.css'
})
export class UserListComponent implements OnInit{
  users!: User[];

  constructor(private userService: UserService) {

  }

  ngOnInit() {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    })
  }
}
