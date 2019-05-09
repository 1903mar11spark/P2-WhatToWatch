import { Component, OnInit, EventEmitter, Output, Input } from '@angular/core';
import { User } from 'src/app/models/User';
import { UserService } from '../../service/user.service'

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {
  @Input() user:User;

  //for when we deleteUser
  @Output() deleteUser: EventEmitter<User>=new EventEmitter();

  constructor(private userService: UserService) { }

  ngOnInit() { }
  }

  setClasses(){
    let classes = {
      user : true,
      firstname: this.firstname,
      lastname: this.lastname,
      username: this.username,
      password: this.password,
      tier: this.accountType,
      answer: this.answer,
      email: this.email
    }
    return classes;
  }

  //when deleting user
  onDelete(user){
    this.deleteTodo.emit(user);
  }

