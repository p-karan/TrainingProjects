import { Component, OnInit } from '@angular/core';
import {Navlink} from '../navlink';
import {CompinteractionService} from '../compinteraction.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  /*links: string[] = ['Home', 'Book', 'Blog']*/
  /*links: string[] = ['login', 'addcustomer', 'showcustomer', 'passenger'];*/
  showLogin = 'inline';
  showLogout = 'none';
  links: Navlink[] = [
/*    {link: 'login', text: 'Login'},*/
    {link: 'addcustomer', text: 'Add Customer'},
    {link: 'showcustomer', text: 'Show Customer'},
    {link: 'passenger', text: 'Show Passenger'}
  ];
  constructor(private service: CompinteractionService) { }

  ngOnInit() {
    this.service.loginStatus.subscribe(resp => {
      console.log(resp);
      if (resp === 'logged') {
        this.showLogin = 'none';
        this.showLogout = 'inline';
      } else {
        this.showLogin = 'inline';
        this.showLogout = 'none';
      }
    });
  }

}
