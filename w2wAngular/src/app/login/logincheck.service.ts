import { Login } from './login.model';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
})
export class LogincheckService {
    constructor(private http: HttpClient){
        
    }
    login(username: string, password: string): Observable<Login>{
        //console.log(username, password);
        //JSON.stringify
        return this.http.post<Login>('http://localhost:8080/WhatToWatch/login', {
            username: username,
            password: password
        });
    }

}
