import {Car} from './Car';

export class PartGroup{
	id: number;
	name: string;
	car: Car;

	constructor(id: number, name: string, car: Car){
		this.id = id;
		this.name = name;
		this.car = car;
	}
}