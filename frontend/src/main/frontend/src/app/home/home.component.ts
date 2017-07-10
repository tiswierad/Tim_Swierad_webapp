import { Component, OnInit } from '@angular/core';
import { GreetingService } from '../shared/greeting.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  title = '';

  constructor(
  private greetingService: GreetingService
  ) { }

  ngOnInit() {
    this.greetingService.getGreeting().subscribe(
      data => this.title = data.content );
  }

}
