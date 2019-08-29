import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component1',
  template: `
  <input [(ngModel)]="name" type="text"> 
  {{name}}
  `,
  styles: [ ]
})
export class Component1Component implements OnInit {

  constructor() { }

  public name ="";

  ngOnInit() {
  }

}
