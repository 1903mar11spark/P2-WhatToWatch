import { Component, OnInit } from '@angular/core';
//import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { LogincheckService } from './logincheck.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username = 'test';
  password = 'test';
  public attempt = {};
  constructor(private router: Router, private login: LogincheckService) { }

  tryLogin(){
    this.login.login(
      this.username,
      this.password
    )
    .subscribe(
      data => { 
        this.attempt = data;
        console.log(data);
        if(this.attempt == 'true'){
          this.router.navigate(['/', 'user']);
        }
    })
        //this.router.navigate(['/', 'user']);
      //}
    //}
    
  }
 
}