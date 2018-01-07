import {PartGroup} from './PartGroup';

export class Part  {
	id: number;
	name: string;
	code: number;
	partGroup: PartGroup;



	constructor(id: number, name: string, code: number, partGroup: PartGroup) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.partGroup = partGroup;
	}
}