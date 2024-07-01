class Person {
    name: string;

    constructor(name: string) {
        this.name = name;
    }
}

//**********Employee*******************//

// class Employee extends Person {
//     empId: number;
//     constructor(empId: number, name: string) {
//         super(name);
//         this.empId = empId;
//     }
// }
// let p: Person = new Person("sohaib");
// console.log(p.name);

// let e: Employee = new Employee(101, "sohiab khan");
// console.log(e.empId + ", " + e.name);

////**********inheritence.ts*******************//

// class Papa {
//     papaName: string;

//     constructor(name: string) {
//         this.papaName = name;
//     }

// }

// class Beta extends Papa {

//     betaName: string;
//     constructor(papaName: string, betaName: string) {
//         super(papaName);
//         this.betaName = betaName;
//     }
// }

// let b: Beta = new Beta("Jhetha lal", "Tappu");
// console.log("papa Name: " + b.papaName + ", beta Name: " + b.betaName);

