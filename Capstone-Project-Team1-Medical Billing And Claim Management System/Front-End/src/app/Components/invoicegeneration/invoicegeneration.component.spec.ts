import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvoicegenerationComponent } from './invoicegeneration.component';

describe('InvoicegenerationComponent', () => {
  let component: InvoicegenerationComponent;
  let fixture: ComponentFixture<InvoicegenerationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InvoicegenerationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InvoicegenerationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
