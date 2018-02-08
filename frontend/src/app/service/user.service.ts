import { Injectable } from '@angular/core';
import {User} from "../model/user.model";
import {Observable} from "rxjs/Observable";
import {HttpClient} from "@angular/common/http";

const url = '/api/registr';

@Injectable()
export class UserService {
  constructor(private http: HttpClient) { }

  create(user: User): Observable<User>{
    return this.http.post<User>(url, user);
  }

  getAll(): Observable<User[]>{
    return this.http.get<User[]>(url);
  }

}
