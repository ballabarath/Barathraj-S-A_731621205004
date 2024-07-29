import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
 name : string;
 age : number;
 email : string;
 imagepath : string;

  constructor(){
    this.name = "Kaivn";
    this.age = 21;
    this.email = "kavin@gmail.com";
    this.imagepath = "https://i.pinimg.com/236x/fa/d5/e7/fad5e79954583ad50ccb3f16ee64f66d.jpg";

  }
  changeName(){
    this.name = "Barath";
  }
  changeAge(){
    this.age = 23;
  }
  changeEmail(){
    this.email = "barath@gmail.com";
  }
  changeImage(){
    this.imagepath = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/06/luffy-from-one-piece-goku-from-dragon-ball-z-and-saitama-from-one-punch-man.jpg";
  }

}
