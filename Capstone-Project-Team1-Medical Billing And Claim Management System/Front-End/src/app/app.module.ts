import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './Components/login/login.component';
import { RegistrationComponent } from './Components/registration/registration.component';
import { DashboardComponent } from './Components/dashboard/dashboard.component';
import { PatientDashboard } from './Components/patientdashboard/patientdashboard.component';
import { ProviderDashboardComponent } from './Components/providerdashboard/providerdashboard.component';
import { InsuranceCompanyDashboardComponent } from './Components/insurancecompanydashboard/insurancecompanydashboard.component';
import { AdminDashboardComponent } from './Components/admindashboard/admindashboard.component';
import { InvoiceGenerationComponent } from './Components/invoicegeneration/invoicegeneration.component';
import { ClaimSubmissionComponent } from './Components/claimsubmission/claimsubmission.component';
import { ClaimProcessingComponent} from './Components/claimprocessing/claimprocessing.component';
import { UserProfileComponent } from './Components/userprofile/userprofile.component';
import { InsurancePlanSelectionComponent } from './Components/insuranceplanselection/insuranceplanselection.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './Components/home/home.component';
import {HttpClientModule } from '@angular/common/http';
import { AuthGuard } from './auth.guard';
import { DataService } from './Services/dataservice.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    DashboardComponent,
    PatientDashboard,
    ProviderDashboardComponent,
    InsuranceCompanyDashboardComponent,
    AdminDashboardComponent,
    InvoiceGenerationComponent,
    ClaimSubmissionComponent,
    ClaimProcessingComponent,
    UserProfileComponent,
    InsurancePlanSelectionComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule
  ],
  providers: [AuthGuard,DataService],
  bootstrap: [AppComponent]
})
export class AppModule {
  
}
