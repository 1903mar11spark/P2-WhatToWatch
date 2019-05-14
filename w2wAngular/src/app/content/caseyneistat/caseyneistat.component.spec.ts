import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CaseyneistatComponent } from './caseyneistat.component';

describe('CaseyneistatComponent', () => {
  let component: CaseyneistatComponent;
  let fixture: ComponentFixture<CaseyneistatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CaseyneistatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CaseyneistatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
