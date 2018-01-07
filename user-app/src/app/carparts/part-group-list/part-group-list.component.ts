import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
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
  private temp: any;
  private id: number;

  constructor(private router: Router,private partGroupService: RestService, private route: ActivatedRoute) { }

  ngOnInit() {
  	this.temp = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

  	this.getPartGroupByCarId(this.id);
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
  choseParts(id: number){
    this.router.navigate(['carparts/parts', id]);
  }
}
