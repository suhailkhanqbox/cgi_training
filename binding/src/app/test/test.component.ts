import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  <h2> Welcome {{name}}</h2> 
  <h2>{{2+9}} </h2>
<h2> {{"Welcome "+ name}}</h2>  
<h2>{{name.length}} </h2>
<h2>{{name.toUpperCase()}} </h2>
<h2>{{greetuser()}} </h2>
<h2>{{siteurl}} </h2>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name= "suhail";
  public siteurl= window.location.href;
  constructor() { }
greetuser()
{
  return "Hello" + this.name;
}
  ngOnInit() {
  }

}
