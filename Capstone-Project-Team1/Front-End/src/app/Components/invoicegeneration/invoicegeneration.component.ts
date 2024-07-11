import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { InvoiceService } from 'src/app/Services/invoiceservice.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoicegeneration.component.html',
  styleUrls: ['./invoicegeneration.component.css']
})
export class InvoiceGenerationComponent implements OnInit {
  invoiceGenerated: boolean = false; 
  subtotal: number = 0; 
  taxRate: number = 0.08; 
  tax: number = 0; 
  total: number = 0; 
  invoiceForm: any;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
   
    this.invoiceForm = this.fb.group({
      patientId: ['', Validators.required],
      patientName: ['', Validators.required], 
      consultationFee: ['', [Validators.required, Validators.min(0)]], 
      diagnosticTestsFee: ['', [Validators.required, Validators.min(0)]], 
      diagnosticScanFee: ['', [Validators.required, Validators.min(0)]], 
      medicationsBillAmount: ['', [Validators.required, Validators.min(0)]] 
    });

   
    this.invoiceForm.valueChanges.subscribe(() => {
      this.calculateInvoice();
    });
  }

  
  calculateInvoice(): void {
    if (this.invoiceForm.valid) {
      const consultationFee = this.invoiceForm.get('consultationFee').value || 0;
      const diagnosticTestsFee = this.invoiceForm.get('diagnosticTestsFee').value || 0;
      const diagnosticScanFee = this.invoiceForm.get('diagnosticScanFee').value || 0;
      const medicationsBillAmount = this.invoiceForm.get('medicationsBillAmount').value || 0;

      this.subtotal = consultationFee + diagnosticTestsFee + diagnosticScanFee + medicationsBillAmount;
      this.tax = this.subtotal * this.taxRate;
      this.total = this.subtotal + this.tax;
    } else {
      
      this.subtotal = 0;
      this.tax = 0;
      this.total = 0;
    }
  }

 
  onSubmit(): void {
    if (this.invoiceForm.valid) {
     
      this.invoiceGenerated = true; 
    } else {
      console.error('Form is invalid. Please fill all required fields correctly.');
    }
  }
}
