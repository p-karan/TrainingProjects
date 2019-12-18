import {Component, OnInit, ViewChild, ViewChildren} from '@angular/core';
import {Loancustomer} from '../loancustomer';
import {CustomerService} from '../customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-addloancustomer',
  templateUrl: './addloancustomer.component.html',
  styleUrls: ['./addloancustomer.component.css']
})
export class AddloancustomerComponent implements OnInit {
  srchString = '';
  customerList: Loancustomer[];
  idxPos = 0;
  customer: Loancustomer = {
    loanId: 0,
    loanType: '',
    openDate: new Date(),
    closingDate: new Date(),
    loanAmount: 0
  };
  @ViewChild('frm', {static: false}) form: any;
  loanType = ['Car', 'Home', 'Jewel', 'Personal'];
  btnText = 'Add';
  constructor(private service: CustomerService, private router: Router) { }

  ngOnInit() {
    const loggedStatus = sessionStorage.getItem('userlogged');
    if(loggedStatus !== 'yes') {
      this.router.navigate(['/login']);
    } else {
      this.service.findAll().subscribe(data => this.customerList = data);
    }
  }

  onSubmit(values) {
    this.customer = values;
    if (this.btnText === 'Add') {
    console.log(this.customer);
    this.service.add(this.customer).subscribe(data => this.customerList.push(data));
  } else {
     this.service.update(this.customer).subscribe(data => this.customerList[this.idxPos] = data) ;
    }
    this.form.reset();
  }

  edit(obj) {
    this.customer = obj;
    this.btnText = 'Update';
    this.idxPos = this.customerList.indexOf(obj);
  }

  delete(obj) {
    const idxPos = this.customerList.indexOf(obj);
    this.service.remove(obj).subscribe(data => this.customerList.splice(idxPos, 1));
  }

}
