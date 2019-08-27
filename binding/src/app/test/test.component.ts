import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  <h2> Welcome {{name}}</h2> 
 <input type="text" value="Suhail Khan">
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
