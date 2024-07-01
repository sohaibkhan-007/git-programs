abstract class person {
    name: string;

    constructor(name: string) {
        this.name = name;

    }
    Display() {
        console.log(this.name);
    }

    abstract find(string): person;
}

class Employe extends person {
    empCode: number;

    constructor(name: string, empcode: number) {
        super(name);
        this.empCode = empcode;
    }
    find(name: string) {
        return new Employe(name, 1);
    }
}


let emp: person = new Employe("sohaib", 101);
emp.Display();
let emp2: person = emp.find("sohaib");
console.log(emp2);