import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class GreetingService {

  constructor(
    private http: Http
  ) { }

  getGreeting() {
    return this.http.get(`/api/greeting`)
    .map((res:Response) => res.json());
  }

}
