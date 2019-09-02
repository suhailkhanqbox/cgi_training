import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-department-details',
  template: `
    <p>
      department-details works!
      you selected deparment {{departmentId}}
    </p>
  `,
  styles: []
})
export class DepartmentDetailsComponent implements OnInit {

  public departmentId;
  constructor(private route: ActivatedRoute){} //import above then inject it 

  ngOnInit() {
    let id = parseInt(this.route.snapshot.paramMap.get('id'));//paraMap to get paramneter from url
    this.departmentId=id; 
  }

}
