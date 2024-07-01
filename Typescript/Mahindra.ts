import { Cars } from "./Cars";
class Mahindra implements Cars{
    carName: string;
    carPrice: number;
    carColor:string;

    constructor(Name: string, price: number,color:string) {
        this.carName = Name;
        this.carPrice = price;
        this.carColor=color;

    }
 
    carDetails(){
        console.log(`Car Name:${this.carName},Car Price:${this.carPrice},car color:${this.carColor}`);
    }
}
let mahindra: Mahindra = new Mahindra("THAR", 1000000,"black");
mahindra.carDetails();