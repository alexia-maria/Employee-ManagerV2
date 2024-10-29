import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

//import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';

import {provideHttpClient} from "@angular/common/http";
import {EmployeeService} from "./service/employee.service";
import { AppRoutingModule} from "./app.routes";


@NgModule({
  declarations: [
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [ provideHttpClient(), EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
