import { Component, OnInit } from '@angular/core';
import {ActivatedRoute,Router} from '@angular/router';
import { YoutubeService } from '../youtube.service';



@Component({
  selector: 'app-favorite',
  templateUrl: './favorite.component.html',
  styleUrls: ['./favorite.component.css']
})
export class FavoriteComponent implements OnInit {


 resp2: any;
 resp3:any;
  constructor(private route:ActivatedRoute, private router: Router, private ytservice:YoutubeService) { }
  /*putFavourite(){
   console.log(this.ytservice.getFavourite().subscribe()) ;
  }*/
  addcomm(input,data){
    this.ytservice.setcomment(input,data).subscribe();
  }
  ngOnInit() {
    console.log(this.ytservice.getFavourite().subscribe( response => {
      this.resp2=response;
            })) ;
  }

}
