import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClaimsubmissionComponent } from './claimsubmission.component';

describe('ClaimsubmissionComponent', () => {
  let component: ClaimsubmissionComponent;
  let fixture: ComponentFixture<ClaimsubmissionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClaimsubmissionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClaimsubmissionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
