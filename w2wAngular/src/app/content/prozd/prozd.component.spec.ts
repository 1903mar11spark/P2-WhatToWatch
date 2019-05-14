import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProzdComponent } from './prozd.component';

describe('ProzdComponent', () => {
  let component: ProzdComponent;
  let fixture: ComponentFixture<ProzdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProzdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProzdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
