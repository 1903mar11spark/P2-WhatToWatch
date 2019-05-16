import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WisecrackComponent } from './wisecrack.component';

describe('WisecrackComponent', () => {
  let component: WisecrackComponent;
  let fixture: ComponentFixture<WisecrackComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WisecrackComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WisecrackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
