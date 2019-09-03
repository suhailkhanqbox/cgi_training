import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap} from '@angular/router'; //import router 

@Component({
  selector: 'app-department-list',
  template: `
    <p>
      department-list
    </p>
    <ul class="items">
        <button (click) = "onSelect(department)" [class.selected]="isSelected(department)" *ngFor="let department of departments" > 
      <span class="badge">{{department.id}}</span>{{department.name}}
      </button> 
    </ul>
  `,
  styles: []
})
export class DepartmentListComponent implements OnInit {
public selectedId;

departments = [
  {"id":1 ,"name":"Angular"},
  {"id":2 ,"name":"Node"},
  {"id":3 ,"name":"MangoDB"},
  {"id":4 ,"name":"Djnago"},
  {"id":5 ,"name":"Bootstrap"},
]

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {

      //let id = parseInt(this.route.snapshot.paramMap.get('id'));//paraMap to get paramneter from url
      //this.departmentId=id; 
      this.route.paramMap.subscribe((params: ParamMap ) =>
      {
        let id =parseInt(params.get('id'));
        this.selectedId = id;
      });
    }

        onSelect(department)
      {
        //this.router.navigate(['/departments', department.id]); 
        this.router.navigate([department.id],{relativeTo: this.route});
      }

      isSelected(department)
      {
      return department.id === this.selectedId;
      }

}
