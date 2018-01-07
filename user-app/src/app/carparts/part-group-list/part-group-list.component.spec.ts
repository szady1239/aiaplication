import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PartGroupListComponent } from './part-group-list.component';

describe('PartGroupListComponent', () => {
  let component: PartGroupListComponent;
  let fixture: ComponentFixture<PartGroupListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PartGroupListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PartGroupListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
