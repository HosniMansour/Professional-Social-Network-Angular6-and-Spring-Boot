import { TestBed } from '@angular/core/testing';

import { CompetenceService } from './competence.service';

describe('CompetenceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CompetenceService = TestBed.get(CompetenceService);
    expect(service).toBeTruthy();
  });
});
