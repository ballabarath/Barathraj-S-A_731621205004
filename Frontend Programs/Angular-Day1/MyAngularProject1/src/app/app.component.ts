import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'

})
export class AppComponent {
//  name : string;
//  age : number;
//  email : string;
//  imagepath : string;
//  fname : string;
//  flag : boolean;
//  image : string;
//  vehicles : string[];
//  selectedvehicles : string;
//  mystyle : {};
//  myClass : string;

//   constructor(){
//     this.name = "Kaivn";
//     this.age = 21;
//     this.email = "kavin@gmail.com";
//     this.imagepath = "https://i.pinimg.com/236x/fa/d5/e7/fad5e79954583ad50ccb3f16ee64f66d.jpg";
//     this.fname = "";
//     this.flag = true;
//     this.image = "https://i.pinimg.com/236x/fa/d5/e7/fad5e79954583ad50ccb3f16ee64f66d.jpg";
//     this.vehicles = ["Naruto","Sasuke","Sakura"];
//     this.selectedvehicles = "";
//     this.mystyle = {'width':'50%','border':'2px solid green','border-radius':'25px','height':'320px','margin-top':'15px'};
//     this.myClass = "MyClass1";
//   }
//   changeName(){
//     this.name = "Barath";
//   }
//   changeAge(){
//     this.age = 23;
//   }
//   changeEmail(){
//     this.email = "barath@gmail.com";
//   }
//   changeImage(){
//     this.imagepath = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/06/luffy-from-one-piece-goku-from-dragon-ball-z-and-saitama-from-one-punch-man.jpg";
//   }
//   changeFlag(){
//     this.flag = ! this.flag;
//   }
//   selectedITem(veh:string){
//     this.selectedvehicles = veh;
//   }
//   changestyle(){
//     this.mystyle = {'width':'50%','border':'2px solid red','border-radius':'25px','height':'320px','margin-top':'15px','background-color':'gray'};
//   }

  sum : number;
  
  constructor(private calc : CalculatorService){
    this.sum = calc.getAddition(10, 20);
  }
  
}
