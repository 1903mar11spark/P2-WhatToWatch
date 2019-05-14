import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '../../environments/environment';
import { User } from '../_models';

@Injectable({ providedIn: 'root' })
export class UserService {
  logout: any;
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(`${environment.apiUrl}/users`);
    }

    getById(id: number) {
        return this.http.get(`${environment.apiUrl}/users/${id}`);
    }

    register(user: User) {
        return this.http.post(`${environment.apiUrl}/users/register`, user);
    }

    update(user: User) {
        return this.http.put(`${environment.apiUrl}/users/${user.id}`, user);
    }

    delete(id: number) {
        return this.http.delete(`${environment.apiUrl}/users/${id}`);
    }
}

import { map } from 'rxjs/operators';
 
import { Observable } from 'rxjs';
import { VideoDetail } from '../_models/user';
 
const YOUTUBE_API_KEY = 'AIzaSyDCZEjLFuLq_XpObgXSV4euMqXYIdU8ckc';
const YOUTUBE_API_URL = 'https://www.googleapis.com/youtube/v3/search';
 
@Injectable({
  providedIn: 'root'
})
export class YoutubeSearchService {
 
  constructor(private http: HttpClient) { }
 
  search(query: string): Observable<VideoDetail[]> {
    const params: string = [
      `q=${query}`,
      `key=${YOUTUBE_API_KEY}`,
      `part=snippet`,
      `type=video`,
      `maxResults=10`
    ].join('&');
 
    const queryUrl = `${YOUTUBE_API_URL}?${params}`;
 
    return this.http.get(queryUrl).pipe(map(response => {
      return response['items'].map(item => {
        return new VideoDetail({
          id: item.id.videoId,
          title: item.snippet.title,
          description: item.snippet.description,
          thumbnailUrl: item.snippet.thumbnails.high.url
        });
      });
    }));
  }
}