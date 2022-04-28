import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-itempage',
  templateUrl: './itempage.component.html',
  styleUrls: ['./itempage.component.css']
})
export class ItempageComponent implements OnInit {
  contactform: FormGroup;
  result: any;
  formData: any;
  n1: any=0;
  n2: any=0;
  n3: any=0;
  np3: any=0;
  totalprice: any="";

  totalpriceshow:any="";

  constructor() {

    this.contactform=new FormGroup({
      name:new FormControl("",[Validators.required,Validators.minLength(2)]),
      price:new FormControl("",[Validators.required,Validators.minLength(2)]),
      quantity:new FormControl("",[Validators.required,Validators.minLength(2)]),
      
      discount:new FormControl("",[Validators.required,Validators.minLength(2)]),
    });

  }
   

  ngOnInit(): void {
  }

  Submit(){

    console.log(this.formData);
    this.result=this.formData

    this.n1=this.result.price
    this.n2=this.result.quantity
    this.n3=this.result.discount 
    this.np3=Number(this.n1)*Number(this.n2)*this.n3/100
    this.totalprice=Number(this.n1)*Number(this.n2)-Number(this.np3)
    this.totalpriceshow="total price for item "+this.result.name+" is:"+this.totalprice
    console.log("totalprice"+this.totalprice);
  

  }
}
