import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CurdMainComponent } from './curd-main.component';

describe('CurdMainComponent', () => {
  let component: CurdMainComponent;
  let fixture: ComponentFixture<CurdMainComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CurdMainComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CurdMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
