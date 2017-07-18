import { Component, OnInit } from '@angular/core';
import { ResumeskillsService } from '../shared/resumeskills/resumeskills.service';
import { ProfexpService } from '../shared/profexp/profexp.service';

@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.css']
})
export class ResumeComponent implements OnInit {

  skillsData;
  profExpData;

  constructor(
    private resumeskillsService: ResumeskillsService,
    private profexpService: ProfexpService
  ) { }

  ngOnInit() {
    this.resumeskillsService.getAllSkills().subscribe( skillsData =>  {this.skillsData = skillsData; } );
    this.profexpService.getAllExp().subscribe(profData => {this.profExpData = profData; } );
  }

}
