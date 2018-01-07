import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CarListComponent } from './carparts/car-list/car-list.component';
import { PartGroupListComponent } from './carparts/part-group-list/part-group-list.component';
import { PartsComponent } from './carparts/parts/parts.component';
import { OrderCartComponent } from './carparts/order-cart/order-cart.component';
import { CarpartsModule} from './carparts/carparts.module';

@NgModule({
  declarations: [
    AppComponent,
    CarListComponent,
    PartGroupListComponent,
    PartsComponent,
    OrderCartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CarpartsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
