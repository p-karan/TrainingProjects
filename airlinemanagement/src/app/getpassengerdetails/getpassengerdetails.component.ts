import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {CustomerService} from '../customer.service';
import {Loancustomer} from '../loancustomer';

@Component({
  selector: 'app-getpassengerdetails',
  templateUrl: './getpassengerdetails.component.html',
  styleUrls: ['./getpassengerdetails.component.css']
})
export class GetpassengerdetailsComponent implements OnInit {

  @Input() reqPnr: string;
  @Output() paxDetail: EventEmitter<Loancustomer> = new EventEmitter<Loancustomer>();
  constructor(private service: CustomerService) { }

  ngOnInit() {
  }

  fetch() {
    /*this.paxDetail.emit('ramesh, chn-mum, 20-12-2019');*/
    this.service.findById(this.reqPnr).subscribe(data => this.paxDetail.emit(data));
  }

}
