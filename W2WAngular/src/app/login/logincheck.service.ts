import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class LogincheckService {
    constructor(private http: HttpClient){
        
    }
    login(username: string, password: string){
        console.log('hello');
        return this.http.post('http://www.mocky.io/v2/5cd591f22e0000a169527793',{
            username: username,
            password: password
        });
    }

}