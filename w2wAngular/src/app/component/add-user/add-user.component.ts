import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  @Output() addUser: EventEmitter<any> = new EventEmitter();

  //return a user object as an Array of strings
  user: Array<string>;

  constructor() { }

  ngOnInit() {
  }

  //this should be creating the user
  onSubmit() {
    const user = {
      firstname: this.firstname,
      lastname: this.lastname,
      username: this.username,
      password: this.password,
      tier: this.accountType,
      answer: this.answer,
      email: this.email;
    }
    this.addUser.emit(user);
  }
}