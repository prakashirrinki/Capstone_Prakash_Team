import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsuranceplanselectionComponent } from './insuranceplanselection.component';

describe('InsuranceplanselectionComponent', () => {
  let component: InsuranceplanselectionComponent;
  let fixture: ComponentFixture<InsuranceplanselectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsuranceplanselectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InsuranceplanselectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
