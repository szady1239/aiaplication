import {Part} from './Part';
import {Order} from './Order'

export class OrderDetail  {
	id: number;
	part: Part;
	order: Order;


	constructor(id: number, part: Part, order: Order) {
		this.id = id;
		this.part = part;
		this.order = order;
	}
}