interface Mother {
    motherName: string;
    motherAge: number;
}
interface Father {
    fatherName: string;
    fatherAge: number;
}

class Children implements Mother, Father {
    fatherName: string;
    motherName: string;
    fatherAge: number;
    motherAge: number;
    childName: string;
    childAge: number;

    constructor(fName: string, mName: string, fAge: number, mAge: number, cName: string, cAge: number) {
        this.fatherName = fName;
        this.fatherAge = fAge;
        this.motherAge = mAge;
        this.motherName = mName;
        this.childAge = cAge;
        this.childName = cName;

    }
    Display() {
        console.log(`Father name: ${this.fatherName},Mother name: ${this.motherName},Father age: ${this.fatherAge},mother age: ${this.motherAge},Child name: ${this.childName},child age:${this.childAge}`);
    }
}

let ch: Children = new Children("Abrham", "Sofia", 35, 30, "Arhan", 10);
ch.Display();
