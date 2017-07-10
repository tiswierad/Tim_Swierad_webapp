import { TestBed, inject } from '@angular/core/testing';

import { ResumeskillsService } from './resumeskills.service';

describe('ResumeskillsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ResumeskillsService]
    });
  });

  it('should ...', inject([ResumeskillsService], (service: ResumeskillsService) => {
    expect(service).toBeTruthy();
  }));
});
