import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { SearchbarComponent } from './searchbar/searchbar.component';


const routes: Routes = [
  {path:"start-page",component:AppComponent},
  {path:"search",component:SearchbarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
