import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {RestService} from "../rest.service";
import {PartGroup} from '../PartGroup';
@Component({
  selector: 'app-part-group-list',
  templateUrl: './part-group-list.component.html',
  styleUrls: ['./part-group-list.component.css'],
  providers: [RestService]
})
export class PartGroupListComponent implements OnInit {
  private partGroups: PartGroup[];
  constructor(private router: Router,private partGroupService: RestService) { }

  ngOnInit() {
  	//this.getPartGroupByCarId(number);
  }

  getPartGroupByCarId(id: number){
  	this.partGroupService.getPartGroups(id).subscribe(
  	pg => {
  		this.partGroups = pg;
  	},
  	err =>{console.log(err);
  	}
  	);

  }
}
