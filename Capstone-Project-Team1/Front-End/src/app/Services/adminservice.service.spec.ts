import { TestBed } from '@angular/core/testing';

import { AdminService } from './adminservice.service';

describe('AdminserviceService', () => {
  let service: AdminService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
