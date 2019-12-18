import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {CompinteractionService} from '../compinteraction.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  formConfig: any[] = [
    {name: 'userName', type: 'text', label: 'User Name', errorMsg: 'Username required', constraint: [Validators.required, Validators.minLength(2), Validators.maxLength(5)]},
    {name: 'passWord', type: 'password', label: 'Password', errorMsg: 'Password required', constraint: [Validators.required, Validators.minLength(2), Validators.maxLength(5)]},
    ];
  private loginStatus: string;
  constructor(private fb: FormBuilder, private router: Router, private service: CompinteractionService) { }

  ngOnInit() {
    this.loginForm = this.createForm();
  }
  createForm(): FormGroup {
    const group = this.fb.group({});
    this.formConfig.forEach(eachConfig => {
      group.addControl(eachConfig.name, new FormControl('', {validators: eachConfig.constraint}));
    });
    return group;
  }
  onSubmit() {
    console.log(this.loginForm.value);
    const uname = this.loginForm.get('userName').value;
    const pword = this.loginForm.get('passWord').value;
    if (uname === 'india' && pword === 'india') {
      this.loginStatus = 'Valid User';
      sessionStorage.setItem('userlogged', 'yes');
      this.service.changeLoginStatus('logged');
      this.router.navigate(['/showcustomer']);
    } else {
      this.router.navigate(['/login']);
    }
  }

}
