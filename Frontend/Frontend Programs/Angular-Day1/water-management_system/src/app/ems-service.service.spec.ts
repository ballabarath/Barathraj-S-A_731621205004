import { TestBed } from '@angular/core/testing';

import { EmsService } from './ems-service.service';

describe('EmsServiceService', () => {
  let service: EmsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
