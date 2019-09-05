import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {SafeResourceUrl} from '@angular/platform-browser';
import {DomSanitizer} from '@angular/platform-browser';
import { YoutubeService } from '../youtube.service';

@Component({
  selector: 'app-video-display',
  templateUrl: './video-display.component.html',
  styleUrls: ['./video-display.component.css']
})
export class VideoDisplayComponent implements OnInit {
  public videoid;
  safeSrc: SafeResourceUrl;
  constructor(private router:ActivatedRoute, private router2:ActivatedRoute,private sanitizer:DomSanitizer,private router3:Router,private youTubeService: YoutubeService) { }
 
  putfavourite(){
    this.router3.navigate(['']).then(()=> this.router3.navigateByUrl(`/favourite`));
  
  }

  /*vidcom(input) {
    this.youTubeService.setcomment(input);
  }*/

  ngOnInit() {
    this.videoid=this.router.snapshot.paramMap.get('videoid');
    this.safeSrc=this.sanitizer.bypassSecurityTrustResourceUrl("https://www.youtube.com/embed/"+this.videoid);
    console.log(this.videoid);
    
  }

}
