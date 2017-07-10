import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class ResumeskillsService {

  constructor(
    private http: Http
  ) { }

  getAllSkills() {
    return this.http.get(`/api/skills/findall`)
    .map((res: Response) => res.json());
  }

}
