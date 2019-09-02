import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'; //import router 

@Component({
  selector: 'app-department-list',
  template: `
    <p>
      department-list
    </p>
    <ul class="items">
        <li (click) = "onSelect(department)" *ngFor="let department of departments" > 
      <span class="badge">{{department.id}}</span>{{department.name}}
      </li> 
    </ul>
  `,
  styles: []
})
export class DepartmentListComponent implements OnInit {

departments = [
  {"id":1 ,"name":"Angular"},
  {"id":2 ,"name":"Node"},
  {"id":3 ,"name":"MangoDB"},
  {"id":4 ,"name":"Djnago"},
  {"id":5 ,"name":"Bootstrap"},
]

  constructor(private router: Router) { }

  ngOnInit() {
  }

        onSelect(department)
      {
      this.router.navigate(['/departments', department.id]); 
      }

}
