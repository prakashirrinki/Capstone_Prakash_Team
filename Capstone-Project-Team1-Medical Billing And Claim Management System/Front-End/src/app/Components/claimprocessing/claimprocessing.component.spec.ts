import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClaimprocessingComponent } from './claimprocessing.component';

describe('ClaimprocessingComponent', () => {
  let component: ClaimprocessingComponent;
  let fixture: ComponentFixture<ClaimprocessingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClaimprocessingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClaimprocessingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
