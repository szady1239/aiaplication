import {Customer} from './Customer';
export class Order{
	id: number;
	customer: Customer;

	constructor(id: number, customer: Customer){
		this.id = id;
		this.customer = customer;
	}



	
}