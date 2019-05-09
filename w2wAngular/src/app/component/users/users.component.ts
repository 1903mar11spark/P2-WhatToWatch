import { Component, OnInit } from '@angular/core';
import { UserService } from '../../service/user.service';
import { User } from '../../models/User';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  users:User[]

  constructor(private userService:UserService) { }

  ngOnInit() {
    this.userService.getUser().subscribe(users =>{
      this.users = users;
    });
  }

  addUser(user: User){
    //make a post request
    this.userService.addUser(user).subscribe(user =>{
      this.users.push(user)
    });
  }

  //could be done differently
  deleteUser(user:User){
    //remove from client side
    this.users = this.users.filter(u => u.id != user.id);

    //remove from server side
    this.userService.deleteUser(user).subscribe();
  }

}
