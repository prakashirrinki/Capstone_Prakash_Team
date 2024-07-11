import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsurancecompanydashboardComponent } from './insurancecompanydashboard.component';

describe('InsurancecompanydashboardComponent', () => {
  let component: InsurancecompanydashboardComponent;
  let fixture: ComponentFixture<InsurancecompanydashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsurancecompanydashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InsurancecompanydashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
