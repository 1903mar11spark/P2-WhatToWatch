import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LastweekComponent } from './lastweek.component';

describe('LastweekComponent', () => {
  let component: LastweekComponent;
  let fixture: ComponentFixture<LastweekComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LastweekComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LastweekComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
