import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PartByCodeComponent } from './part-by-code.component';

describe('PartByCodeComponent', () => {
  let component: PartByCodeComponent;
  let fixture: ComponentFixture<PartByCodeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PartByCodeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PartByCodeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
