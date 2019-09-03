import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router,ParamMap } from '@angular/router';
import { parse } from 'url';

@Component({
  selector: 'app-department-details',
  template: `
    <p>
      department-details works!
      you selected deparment {{departmentId}}
    </p>
    <router-outlet></router-outlet>
    <div> 
    <button (click)="showOverview()">Overview</button>
    <button (click)="showContact()">Contact</button>
    </div>
    <button (click)= "goPrevious()"> Previous</button>
    <button (click)= "goNext()"> Next</button> 
    <div>
    <button (click) = "gotoDepartments()"> </button>
    </div>
  `,
  styles: []
})
//to navigate we need router service after adding click event
export class DepartmentDetailsComponent implements OnInit {

  public departmentId;
  constructor(private route: ActivatedRoute, private router: Router){} //import above then inject it 

  ngOnInit() {
    //let id = parseInt(this.route.snapshot.paramMap.get('id'));//paraMap to get paramneter from url
    //this.departmentId=id; 
    this.route.paramMap.subscribe((params: ParamMap ) =>
    {
      let id =parseInt(params.get('id'));
      this.departmentId=id;
    });
  }

  goPrevious(){
    let previousId= this.departmentId-1;
    this.router.navigate(['/departments',previousId]);
  }

  goNext(){
    let nextId= this.departmentId+1;
    this.router.navigate(['/departments',nextId]);
  }

  gotoDepartments(){

let selectedId = this.departmentId ? this.departmentId :null;
//this.router.navigate(['/departments', {id:selectedId}]);
this.router.navigate(['../',{id:selectedId}],{relativeTo: this.route});
  }

  showContact(){
      this.router.navigate(['contact'], {relativeTo: this.route});
  }

  showOverview(){
      this.router.navigate(['overview'],{relativeTo: this.route});
  }
}
