import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DepartmentListComponent } from './department-list/department-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [
{path: '', redirectTo:'/departments',pathMatch:'full'}, //redirect when full url is empty
//{path: '', component:DepartmentListComponent},//default route using component
{path: 'departments', component:DepartmentListComponent},
{path: 'employees', component:EmployeeListComponent},
{path: "**", component: PageNotFoundComponent} //wild card route, 
//it should be end of all path

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[DepartmentListComponent, 
                                 EmployeeListComponent,
                                 PageNotFoundComponent]