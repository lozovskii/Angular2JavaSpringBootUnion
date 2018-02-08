import { Component, OnInit } from '@angular/core';
import {User} from "../../model/user.model";
import {UserService} from "../../service/user.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-registr',
  templateUrl: './registr.component.html',
  styleUrls: ['./registr.component.css']
})
export class RegistrComponent implements OnInit {
  userForm: FormGroup;
  user: User;
  users: User[] = [];

  constructor(private userService: UserService) {}

  ngOnInit() {
    this.initForm();
    this.userService.getAll().subscribe((users: User[]) => {
      this.users = users;
    });
  }

  submitForm(user: User):void{
    console.log(user);
    this.userService.create(user).subscribe((user: User) => {
      this.users.push(user)
    });
  }

  private initForm(): void {
    this.userForm = new FormGroup({
      firstName: new FormControl(),
      phoneNumber: new FormControl()
    })
  }

}
