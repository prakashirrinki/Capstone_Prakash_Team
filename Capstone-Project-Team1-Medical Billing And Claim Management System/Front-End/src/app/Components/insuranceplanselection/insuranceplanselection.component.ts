import { Component, OnInit } from '@angular/core';
import { InsuranceService } from '../../Services/insuranceservice.service';

@Component({
  selector: 'app-insurance-plan-selection',
  templateUrl: './insuranceplanselection.component.html',
  styleUrls: ['./insuranceplanselection.component.css']
})
export class InsurancePlanSelectionComponent implements OnInit {
  insurancePlans: any[] = [];
  selectedPlan: any;

  constructor(private insuranceService: InsuranceService) { }

  ngOnInit() {
    this.loadInsurancePlans();
  }

  loadInsurancePlans() {
    this.insuranceService.getInsurancePlans().subscribe(
      plans => {
        this.insurancePlans = plans;
      },
      error => {
        console.error('Error loading insurance plans:', error);
      }
    );
  }

  selectPlan(plan: any) {
    this.selectedPlan = plan;
  }

  confirmSelection() {
    if (this.selectedPlan) {
      this.insuranceService.selectInsurancePlan(this.selectedPlan.id).subscribe(
        result => {
          console.log('Insurance plan selected:', result);
          // Handle success (e.g., show success message, navigate to dashboard)
        },
        error => {
          console.error('Error selecting insurance plan:', error);
          // Handle error (e.g., show error message)
        }
      );
    }
  }
}