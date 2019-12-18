import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Loancustomer} from './loancustomer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  baseURL = 'http://localhost:9876/customer';
 /* getCustomerURL = 'http://localhost:5050/customer/';*/

  constructor(private client: HttpClient) {
  }

  findAll(): Observable<Loancustomer[]> {
    return this.client.get<Loancustomer[]>(this.baseURL);
  }

  findById(id: string): Observable<Loancustomer> {
    return  this.client.get<Loancustomer>(this.baseURL + '/' + id);
  }
  add(loan: Loancustomer): Observable<Loancustomer> {
    return this.client.post<Loancustomer>(this.baseURL, loan);
  }

  remove(loan: Loancustomer): Observable<Loancustomer> {
    const headers = new HttpHeaders().set('content-type', 'application/json');

    return this.client.delete<Loancustomer>(this.baseURL + '/' + loan.loanId);
    /*return this.client.request<Loancustomer>('Delete', this.baseURL, {body: loan, headers});*/
  }

  update(loan: Loancustomer): Observable<Loancustomer> {
    return this.client.put<Loancustomer>(this.baseURL, loan);
  }

  /*findCustomer(): Observable<LoanCustomer[]> {
    return this.client.get<LoanCustomer[](this.getCustomerURL);
  }*/
}
