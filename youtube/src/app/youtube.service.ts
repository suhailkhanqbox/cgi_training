
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  public url:string="";

  apiKey : string = 'AIzaSyAFm4drVZmnAEoKaBqdnscZE74-J4f2mAs';

  constructor(public http: HttpClient) { }
  searchyoutube(value){
    this.url = "https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=25&q=" +value+"&key=AIzaSyAFm4drVZmnAEoKaBqdnscZE74-J4f2mAs" ;
    return this.http.get(this.url).subscribe();
 
  }
  returnSearch():Observable<any>{
    return this.http.get<any>(this.url);
  } //return when called from serachbar component

  getVideosForChanel(channel, maxResults): Observable<Object> {
    let url = 'https://www.googleapis.com/youtube/v3/search?key=' + this.apiKey + '&channelId=' + channel + '&order=date&part=snippet &type=video,id&maxResults=' + maxResults
    return this.http.get(url)
      .pipe(map((res) => {
        return res;
      }))
  }

  setFavourite(value):Observable<any>
  {
    return this.http.post<any>("http://localhost:3000/favlist/",value);
  }
  getFavourite():Observable<any>{
    return this.http.get<any>("http://localhost:3000/favlist/");
  }

  setcomment(input,data):Observable<any>
  {
    console.log(input+" "+data);
    return this.http.patch<any>("http://localhost:3000/favlist/"+input,{"comment":data});
  }
}