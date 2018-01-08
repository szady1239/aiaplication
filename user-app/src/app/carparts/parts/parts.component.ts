import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Part} from '../Part';
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
    searchByCodeForm: FormGroup;
  searchByNameForm: FormGroup;
  constructor(private router: Router, private route: ActivatedRoute, private partService: RestService) { }

  ngOnInit() {
        this.searchByCodeForm = new FormGroup({
      code: new FormControl('',Validators.required)
    });
    this.searchByNameForm = new FormGroup({
      name: new FormControl('',Validators.required)
    });
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
  onSubmit(){
    if(this.searchByCodeForm.valid){
      let code = this.searchByCodeForm.controls['code'].value;
      this.searchByCode(code);
    }
    else if(this.searchByNameForm.valid){
      let name = this.searchByNameForm.controls['name'].value;
      this.searchByName(name);
    }
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
