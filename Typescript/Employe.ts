abstract class Employe {
    id: number;
    name: string;
    protected basicSalary: number;

    constructor( id: number,name: string, empSalary: number) {
        this.name = name;
        this.id = id;
        this.basicSalary = empSalary
    }

    abstract CallSalary(hours: number);

    abstract greeting(name: String);



}

class Trainer1 extends Employe{
    CallSalary(hours: number) {
        var totalSalary=this.basicSalary+(hours*2000);
        console.log(totalSalary);
    }
    greeting():String {
        return "Welcome "+this.name;
    }
    
}

let t:Trainer1=new Trainer1(101,"sohaib",10000);
console.log(t.greeting());
t.CallSalary(4);