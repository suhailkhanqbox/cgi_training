import { Component, OnInit } from '@angular/core';
import { YoutubeService } from '../youtube.service';

@Component({
  selector: 'app-searchbar',
  templateUrl: './searchbar.component.html',
  styleUrls: ['./searchbar.component.css']
})
export class SearchbarComponent implements OnInit {

  public fetchresult: any[];
  constructor(private httpsearch: YoutubeService) { }

  ngOnInit() {
  this.httpsearch.returnSearch().subscribe((data)=>{
    console.log(data);
    this.fetchresult=data.items;
    console.log(this.fetchresult);
  })
    
  }

}
