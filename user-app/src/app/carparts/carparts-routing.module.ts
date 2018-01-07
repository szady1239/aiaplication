import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent} from './car-list/car-list.component';
import { PartsComponent} from './parts/parts.component';
import { PartGroupListComponent} from './part-group-list/part-group-list.component';
import { OrderCartComponent} from './order-cart/order-cart.component';

const routes: Routes = [
	{path: 'carparts/cars', component: CarListComponent},
	{path: 'carparts/partsgroup/:id', component: PartGroupListComponent},
	{path: 'carparts/parts', component:PartsComponent},
	{path: 'carparts/ordercart', component: OrderCartComponent}


];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CarpartsRoutingModule { }
