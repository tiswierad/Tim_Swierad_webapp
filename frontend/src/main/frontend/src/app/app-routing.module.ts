import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ProjectsComponent } from './projects/projects.component';
import { ContactComponent } from './contact/contact.component';
import { ResumeComponent } from './resume/resume.component';
import { DashboardComponent } from './dashboard/dashboard.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent,
    data: {
          breadcrumb: "Home"
        }
  },
  {
    path: 'about',
    component: AboutComponent,
    data: {
          breadcrumb: "About"
        }
  },
  {
    path: 'resume',
    component: ResumeComponent,
    data: {
          breadcrumb: "Resume"
        }
  },
  {
    path: 'projects',
    component: ProjectsComponent,
    data: {
          breadcrumb: "Projects"
        }
  },
  {
    path: 'contact',
    component: ContactComponent,
    data: {
          breadcrumb: "Contact"
        }
  },{
    path: 'dashboard',
    component: DashboardComponent,
    data: {
          breadcrumb: "Dashboard"
        }
  },
  {
        path: '',
        redirectTo: '/home',
        pathMatch: 'full'
    },
    {
        path: '**',
        redirectTo: '/home',
        pathMatch: 'full'
    }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
