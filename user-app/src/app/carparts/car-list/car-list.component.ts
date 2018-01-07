import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Car } from '../Car';
import { RestService} from '../rest.service';
@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css'],
  providers: [RestService]
})
export class CarListComponent implements OnInit {

	private cars: Car[];
	carForm: FormGroup;
	nextStep: boolean;


  constructor(private router: Router, private carService: RestService) { }

  ngOnInit() {
  	this.nextStep = false;
  	this.carForm = new FormGroup({
  		code: new FormControl('',Validators.required),
  		name: new FormControl('',Validators.required)
  	});
  }

  onSubmit(){
  	if(this.carForm.valid){
  		let
  	}
  }

}
