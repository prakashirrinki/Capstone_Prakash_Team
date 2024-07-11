import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './Components/admindashboard/admindashboard.component';
import { ClaimSubmissionComponent } from './Components/claimsubmission/claimsubmission.component';
import { DashboardComponent } from './Components/dashboard/dashboard.component';
import { InsuranceCompanyDashboardComponent } from './Components/insurancecompanydashboard/insurancecompanydashboard.component';
import { InsurancePlanSelectionComponent } from './Components/insuranceplanselection/insuranceplanselection.component';
import { InvoiceGenerationComponent } from './Components/invoicegeneration/invoicegeneration.component';
import { LoginComponent } from './Components/login/login.component';
import { ProviderDashboardComponent } from './Components/providerdashboard/providerdashboard.component';
import { RegistrationComponent } from './Components/registration/registration.component';
import { UserProfileComponent } from './Components/userprofile/userprofile.component';
import { PatientDashboard } from './Components/patientdashboard/patientdashboard.component';
import { ClaimProcessingComponent } from './Components/claimprocessing/claimprocessing.component';
import { AuthGuard } from './auth.guard';

const routes: Routes = [
  { path: 'login', component:LoginComponent},
  { path: 'registration', component: RegistrationComponent },
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard] },
  { path: 'patientdashboard', component: PatientDashboard },
  { path: 'providerdashboard', component: ProviderDashboardComponent },
  { path: 'insurancecompanydashboard', component: InsuranceCompanyDashboardComponent },
  { path: 'admindashboard', component: AdminDashboardComponent },
  { path: 'invoicegeneration', component: InvoiceGenerationComponent },
  { path: 'claimsubmission', component: ClaimSubmissionComponent },
  { path: 'claimprocessing', component: ClaimProcessingComponent },
  { path: 'userprofile', component: UserProfileComponent },
  { path: 'insuranceplanselection', component: InsurancePlanSelectionComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' }, 
  { path: '**', redirectTo: '/home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
