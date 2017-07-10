import { Component, OnInit } from '@angular/core';
import { ResumeskillsService } from '../shared/resumeskills/resumeskills.service';

@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.css']
})
export class ResumeComponent implements OnInit {

  data;

  constructor(
    private resumeskillsService: ResumeskillsService
  ) { }

  ngOnInit() {
    this.resumeskillsService.getAllSkills().subscribe(
      data =>  {this.data = data; } );
    console.log(this.data);
  }

}
