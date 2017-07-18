import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ProjectsComponent } from './projects/projects.component';
import { ContactComponent } from './contact/contact.component';
import { AppRoutingModule } from './app-routing.module';
import { ResumeComponent } from './resume/resume.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { GreetingService} from './shared/greeting.service';
import { ResumeskillsService} from './shared/resumeskills/resumeskills.service';
import { ProfexpService} from './shared/profexp/profexp.service';
import { HealthService} from './shared/health/health.service';
import { CarouselitemsService} from './shared/carouselitems.service';
import { BreadcrumbComponent } from './breadcrumb/breadcrumb.component';
import { CarouselComponent } from './carousel/carousel.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ProjectsComponent,
    ContactComponent,
    ResumeComponent,
    DashboardComponent,
    BreadcrumbComponent,
    CarouselComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    NgbModule.forRoot()
  ],
  providers: [GreetingService,
              ResumeskillsService,
              ProfexpService,
              HealthService,
              CarouselitemsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
