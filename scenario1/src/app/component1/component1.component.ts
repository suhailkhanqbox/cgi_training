import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component1',
  template: ` 
  <div> 
  <input #id1 type="text">
  <button (click)="onclick(id1.value)">check console </button>
 
  </div>
  `,
  styles: [`
  
  
  `]
})
export class Component1Component implements OnInit {

  
  constructor() { }

  ngOnInit() {
  }
  onclick(value)
  {
    console.log(value);
  }
}
