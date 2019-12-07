import { Component, OnInit } from '@angular/core';
import {Passenger} from '../passenger';
@Component({
  selector: 'app-show-passenger',
  templateUrl: './show-passenger.component.html',
  styleUrls: ['./show-passenger.component.css']
})
export class ShowPassengerComponent implements OnInit {
  passList: Passenger[] = [{passName: 'Ramesh', source: 'Mumbai', destination: 'Delhi'},
    {passName: 'Karan', source: 'Mumbai', destination: 'Delhi'}];
  constructor() { }

  ngOnInit() {
  }

}
