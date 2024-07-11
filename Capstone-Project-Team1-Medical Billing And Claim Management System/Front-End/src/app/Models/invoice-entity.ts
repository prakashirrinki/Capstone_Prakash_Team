export interface InvoiceEntity {

    invoiceId:number;
    invoiceDate:Date;
    invoiceTax:number;
    consultationFee:number;
    diagnosticsTestsFee:number;
    diagnosticsScanFee:number;
    invoiceTotalAmount:number;
    totalBillAmount:number;

}
