import { Router } from '@angular/router';
import { LogincheckService } from './logincheck.service';
import { Component } from '@angular/core';




@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
//export class LoginComponent implements OnInit {
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
        if(this.attempt){
          this.router.navigate(['/', 'user']);
        }
    })
    
  }
 
}