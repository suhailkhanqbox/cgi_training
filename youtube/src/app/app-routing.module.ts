import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { SearchbarComponent } from './searchbar/searchbar.component';
import { VideoDisplayComponent } from './video-display/video-display.component';
import { FavoriteComponent } from './favorite/favorite.component';


const routes: Routes = [
  {path:"start-page",component:AppComponent},
  {path:"search",component:SearchbarComponent},
  {path:"display/:videoid",component:VideoDisplayComponent},
  {path:"favourite",component:FavoriteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
