import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowPassengerComponent } from './show-passenger.component';

describe('ShowPassengerComponent', () => {
  let component: ShowPassengerComponent;
  let fixture: ComponentFixture<ShowPassengerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowPassengerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowPassengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
