import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CarpartsRoutingModule } from './carparts-routing.module';
import { CarListComponent } from './car-list/car-list.component';
import { PartGroupListComponent } from './part-group-list/part-group-list.component';
import { PartsComponent } from './parts/parts.component';
import { OrderCartComponent } from './order-cart/order-cart.component';
import { PartByCodeComponent } from './part-by-code/part-by-code.component';
import { PartByNameComponent } from './part-by-name/part-by-name.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";



@NgModule({
  imports: [
    CommonModule,
    CarpartsRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [CarListComponent, PartGroupListComponent, PartsComponent, OrderCartComponent, PartByCodeComponent, PartByNameComponent]
})
export class CarpartsModule { 




}
