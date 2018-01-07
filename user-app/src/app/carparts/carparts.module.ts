import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CarpartsRoutingModule } from './carparts-routing.module';
import { CarListComponent } from './car-list/car-list.component';
import { PartGroupListComponent } from './part-group-list/part-group-list.component';
import { PartsComponent } from './parts/parts.component';
import { OrderCartComponent } from './order-cart/order-cart.component';



@NgModule({
  imports: [
    CommonModule,
    CarpartsRoutingModule
  ],
  declarations: [CarListComponent, PartGroupListComponent, PartsComponent, OrderCartComponent]
})
export class CarpartsModule { 




}
