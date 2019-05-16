import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DobrikComponent } from './dobrik.component';

describe('DobrikComponent', () => {
  let component: DobrikComponent;
  let fixture: ComponentFixture<DobrikComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DobrikComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DobrikComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
