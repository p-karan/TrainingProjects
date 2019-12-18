import { Component, OnInit } from '@angular/core';
import {Loancustomer} from '../loancustomer';
import {CustomerService} from '../customer.service';

@Component({
  selector: 'app-showcustomer',
  templateUrl: './showcustomer.component.html',
  styleUrls: ['./showcustomer.component.css']
})
export class ShowcustomerComponent implements OnInit {

  customerList: Loancustomer[];
  constructor(private service: CustomerService) { }

  ngOnInit() {
    /*this.service.findAll().subscribe(data => this.customerList = data);*/
  }
  fetch(): void {
    this.service.findAll().subscribe(data => this.customerList = data);
  }

}
