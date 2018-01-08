import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Observable";
import {Http, Response, RequestOptions, URLSearchParams} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Customer} from './Customer';
import {Order} from './Order';
import {OrderDetail} from './OrderDetail';
import {Part} from './Part';
import {PartGroup} from './PartGroup';
import {Car} from './Car';


@Injectable()
export class RestService {

	private apiUrlFindAllCars = 'http://localhost:8080/findAllCars';
	private apiUrlFindCustomerById = 'http://localhost:8080/findCustomerById/';
	private apiUrlFindOrderById = 'http://localhost:8080/findOrderByid/';
	private apiUrlSaveOrder = 'http://localhost:8080/saveOrder'
	private apiUrlSaveOrderDetail = 'http://localhost:8080/saveOrderDetail';
	private apiUrlFindPartByName = 'http://localhost:8080/findPartByName/';
	private apiUrlFindPartByCode = 'http://localhost:8080/findPartByCode/';
	private apiUrlFindPartGroupByCar = 'http://localhost:8080/findPartGroupByCar/';
	private apiUrlFindPartByGroupId = 'http://localhost:8080//getPartByPartGroupId/';

  constructor(private http: Http) {
  }

  getCars():Observable<Car[]>{
  	return this.http.get(this.apiUrlFindAllCars)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getPartGroups(carId: number):Observable<PartGroup[]>{
  	return this.http.get(this.apiUrlFindPartGroupByCar+carId)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
	}

  getParts(partGroupId: number):Observable<Part[]>{
  	return this.http.get(this.apiUrlFindPartByGroupId+partGroupId)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getPartByCode(code: number):Observable<Part[]>{
  	return this.http.get(this.apiUrlFindPartByCode+code)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getPartByName(name: string):Observable<Part[]>{
  	return this.http.get(this.apiUrlFindPartByName+name)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getCustomer(id: number):Observable<Customer>{
  	return this.http.get(this.apiUrlFindCustomerById+id)
  	.map((res: Response) => res.json())
  	.catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  saveOrder(customer: string):Observable<string>{
  	let myParams = new URLSearchParams();
  	myParams.set('customer', customer);
  	let options = new RequestOptions({params: myParams});
  	return this.http.get(this.apiUrlSaveOrder, options)
  	.map((res: Response) => res.json())
 	.catch((error: any) => Observable.throw(error || 'Server error'));
  }

  saveOrderDetail(order: string, customer: string):Observable<String>{
  	let myParams = new URLSearchParams();
  	myParams.set('order', order);
  	myParams.set('customer', customer);
  	let options = new RequestOptions({params: myParams});
  	return this.http.get(this.apiUrlSaveOrderDetail, options)
  	.map((res: Response) => res.json())
 	.catch((error: any) => Observable.throw(error || 'Server error'));
  }


}
