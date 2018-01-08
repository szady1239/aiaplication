import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PartByNameComponent } from './part-by-name.component';

describe('PartByNameComponent', () => {
  let component: PartByNameComponent;
  let fixture: ComponentFixture<PartByNameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PartByNameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PartByNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
