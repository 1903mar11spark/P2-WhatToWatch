
import { LogincheckService } from './login/logincheck.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
//import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component'
//import { AuthService } from './auth.service'
//import { UserService } from './user.service'
//import { AuthGuard } from './auth.guard';
import { LogoutComponent } from './logout/logout.component';
import { UserViewComponent } from './user-view/user-view.component';
import { WisecrackComponent } from './content/wisecrack/wisecrack.component';
import { FormsModule } from '@angular/forms';

//import { Observable } from 'rxjs';
//import { map } from 'rxjs/operators';

// used to create fake backend
// import { fakeBackendProvider } from './_helpers';
// import { routing }        from './app.routing';


// import { JwtInterceptor, ErrorInterceptor } from './_helpers';
import { RegisterComponent } from './register';
import { AlertComponent } from './alert/alert.component';
import { AuthService } from './_services/auth.service';
import { UserService } from './_services';
import { AuthGuard } from './_guards';
import { EspnComponent } from './content/espn/espn.component';
import { DobrikComponent } from './content/dobrik/dobrik.component';
import { LastweekComponent } from './content/lastweek/lastweek.component';
import { CatsComponent } from './content/cats/cats.component';
import { ProzdComponent } from './content/prozd/prozd.component';
import { TedComponent } from './content/ted/ted.component';
import { BonComponent } from './content/bon/bon.component';
import { CaseyneistatComponent } from './content/caseyneistat/caseyneistat.component';
import { SettledComponent } from './content/settled/settled.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    //AdminComponent,
    HomeComponent,
    LogoutComponent,
    UserViewComponent,
    WisecrackComponent,
    RegisterComponent,
    AlertComponent,
    EspnComponent,
    DobrikComponent,
    LastweekComponent,
    CatsComponent,
    ProzdComponent,
    TedComponent,
    BonComponent,
    CaseyneistatComponent,
    SettledComponent,
    
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    //Observable,
    //Map,
    RouterModule.forRoot([
      {
        path: '',
        component: LoginComponent
      },
      {
        path: 'logout',
        component: LogoutComponent
      },
      //{
       // path: 'admin',
        //component: AdminComponent,
        //canActivate: [AuthGuard]
      //},
      //{
        //path: '',
        //component: HomeComponent
      //},
      {
        path: 'user',
        component: UserViewComponent
      },
      {
      path: 'wisecrack',
      component: WisecrackComponent
      },
      {
      path: 'espn',
      component: EspnComponent
      },
      {
        path: 'dobrik',
        component: DobrikComponent
      },
      {
        path: 'cats',
        component: CatsComponent
      },
      {
        path: 'prozd',
        component: ProzdComponent
      },
      {
        path: 'lastweek',
        component: LastweekComponent
      },
      {
        path: 'bon',
        component: BonComponent
      },
      {
        path: 'caseyneistat',
        component: CaseyneistatComponent
      },
      {
        path: 'settled',
        component: SettledComponent
      },
      {
        path: 'ted',
        component: TedComponent
      }
    ])
  ],
  providers: [AuthService, UserService, AuthGuard, LogincheckService
    //,  { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
      //  { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },

        // provider used to create fake backend
        //fakeBackendProvider
      ],
  bootstrap: [AppComponent]

   
})

export class AppModule { }