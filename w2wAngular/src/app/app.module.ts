import { LogincheckService } from './login/logincheck.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component'
import { AuthService } from './auth.service'
import { UserService } from './user.service'
import { AuthGuard } from './auth.guard';
import { LogoutComponent } from './logout/logout.component';
import { UserViewComponent } from './user-view/user-view.component';
import { WisecrackComponent } from './content/wisecrack/wisecrack.component';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    HomeComponent,
    LogoutComponent,
    UserViewComponent,
    WisecrackComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: 'login',
        component: LoginComponent
      },
      {
        path: 'logout',
        component: LogoutComponent
      },
      {
        path: 'admin',
        component: AdminComponent,
        canActivate: [AuthGuard]
      },
      {
        path: '',
        component: HomeComponent
      },
      {
        path: 'user',
        component: UserViewComponent
      },
      {
      path: 'wisecrack',
      component: WisecrackComponent
      }
    ])
  ],
  providers: [AuthService, UserService, AuthGuard, LogincheckService],
  bootstrap: [AppComponent]
})
export class AppModule { }