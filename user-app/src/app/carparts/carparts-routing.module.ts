import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent} from './car-list/car-list.component';
import { PartsComponent} from './parts/parts.component';
import { PartGroupListComponent} from './part-group-list/part-group-list.component';
import { OrderCartComponent} from './order-cart/order-cart.component';
import { PartByNameComponent} from './part-by-name/part-by-name.component';
import { PartByCodeComponent} from './part-by-code/part-by-code.component';
const routes: Routes = [
	{path: 'carparts/cars', component: CarListComponent},
	{path: 'carparts/partsgroup/:id', component: PartGroupListComponent},
	{path: 'carparts/parts/:id', component:PartsComponent},
	{path: 'carparts/ordercart', component: OrderCartComponent},
	{path: 'carparts/partbyname/:name', component: PartByNameComponent},
	{path: 'carparts/partbycode/:code', component: PartByCodeComponent}

];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CarpartsRoutingModule { }
