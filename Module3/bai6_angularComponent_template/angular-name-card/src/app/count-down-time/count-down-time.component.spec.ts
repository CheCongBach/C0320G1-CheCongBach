import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountDownTimeComponent } from './count-down-time.component';

describe('CountDownTimeComponent', () => {
  let component: CountDownTimeComponent;
  let fixture: ComponentFixture<CountDownTimeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountDownTimeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountDownTimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
