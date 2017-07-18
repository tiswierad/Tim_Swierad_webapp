import { Component, OnInit } from '@angular/core';
import { GreetingService } from './shared/greeting.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = '';

  constructor(
    private greetingService: GreetingService
  ) {}

  ngOnInit() {
    this.greetingService.getGreeting().subscribe(
      data =>  {console.log(data); this.title = data.content; });
  }
}
