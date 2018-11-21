import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'project1';

  messageText:string = '';

  constructor(private httpClient:HttpClient){}

ngOnInit(){
	  this.httpClient.get("http://localhost:8080/homework/messages").subscribe(

	  	(data:any[])=>{
	  		this.messageText = data[0].message;
	  	}

	  )
  }

}
