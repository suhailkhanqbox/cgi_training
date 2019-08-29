import { Component, OnInit, Input, OnChanges } from '@angular/core';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html' ,
  styleUrls: ['./component2.component.css']
})
export class Component2Component implements OnInit, OnChanges {
 
  @Input('parentData') public child;
  constructor() { }

  ngOnInit() {
  }
  ngOnChanges(data) {
    console.log(data)
  }

}
