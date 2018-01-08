import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Car } from '../Car';
import {PartGroup} from '../PartGroup';
import { RestService} from '../rest.service';
@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css'],
  providers: [RestService]
})
export class CarListComponent implements OnInit {

	private cars: Car[];
  searchByCodeForm: FormGroup;
  searchByNameForm: FormGroup;
  constructor(private router: Router, private carService: RestService) { }

  ngOnInit() {
    this.searchByCodeForm = new FormGroup({
      code: new FormControl('',Validators.required)
    });
    this.searchByNameForm = new FormGroup({
      name: new FormControl('',Validators.required)
    });
    this.getAllCars();
  	
  }

  onSubmit(){
    if(this.searchByCodeForm.valid){
      let code = this.searchByCodeForm.controls['code'].value;
      this.searchByCode(code);
    }
  }
  onSubmit2(){
    if(this.searchByNameForm.valid){
      let name = this.searchByNameForm.controls['name'].value;
      this.searchByName(name);
    }
  }

  getAllCars(){
  	this.carService.getCars().subscribe(
  	c => {
  		this.cars = c;
  	},
  	err =>{console.log(err);
  	}
  	);
  }

  chosePartGroup(id: number)
  {
    this.router.navigate(['/carparts/partsgroup', id]);
  }

  searchByCode(code: number)
  {
    this.router.navigate(['/carparts/partbycode', code]);
  }

  searchByName(name: string)
  {
    this.router.navigate(['/carparts/partbyname', name]);
  }

}
