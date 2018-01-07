import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Part} from '../Part;
import {RestService} from "../rest.service";

@Component({
  selector: 'app-parts',
  templateUrl: './parts.component.html',
  styleUrls: ['./parts.component.css'],
  providers: [RestService]
})
export class PartsComponent implements OnInit {
  private temp: any;
  private id: number;
  private parts: Part[];
  constructor(private router: Router, private route: ActivatedRoute, private partService: RestService) { }

  ngOnInit() {
  	  this.temp = this.route.params.subscribe(params => {
      this.id = params['id'];
    });
  	this.getPartsByGroupId(this.id);
  }

  getPartsByGroupId(id: number){
  	this.partService.getParts(id).subscribe(
  		p => {
  		this.parts = p;
  	},
  	err =>{console.log(err);
  	}
  	);
  }
}
