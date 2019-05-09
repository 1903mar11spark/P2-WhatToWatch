import { Injectable } from '@angular/core';
import{ Observable, ObservableLike } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import{ User } from '../models/User';

//bc we send and recieve as JSON objects
const httpOptions={
  headers: new HttpHeaders({
    'Conent-Type': 'application/json'
  })
}


@Injectable({
  providedIn: 'root'
})
export class UserService {
  //java enpoint, localhost, not youtube api
  userUrl: string ='';

  constructor(private http:HttpClient) { }

  //Get User
  getUser():Observable<User[]>{
    //get request to json from Java/database
    return this.http.get<User[]>(`${this.userUrl}`);
  }

  //Delete User, user or admin wants to cancle the account
  deleteUser(user:User):Observable<User>{
    const url = `${this.userUrl}`//append end of url for deleting user
    return this.http.delete<User>(url,httpOptions)
  }

  //add and creating user
  addUser(user:User):Observable<any>{
    return this.http.post<User>(this.userUrl, user, httpOptions)
  }
}
