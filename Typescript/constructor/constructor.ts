// abstract class constructor1 {

//     greet: string;
//     constructor(greet: string) {
//         this.greet = greet;
//     }
//     abstract greeting(): void;

// }

// let c = function () {
//     function greeting(): void {
//         this.greet = "good night";
//         console.log("Good morning.");
//     }
//     c.prototype.greet = function () { return }
// }
// let c:class=new class();
// c.prototype.greet();


//*********  Constructor initialization  *********//

// class Student {
//     studentId: number;
//     studentName: string;

//     constructor(studentId: number, studentName: string) {
//         this.studentId = studentId;
//         this.studentName = studentName;
//     }
//     Display(){
//         console.log("Student name: "+this.studentName+", student Id: "+this.studentId);
//     }

// }
// let student: Student = new Student(101, "sohaib");
// student.Display();
//**************************************** *//


class Student {
    studentId: number;
    studentName: string;

    constructor(Id: number = 1, Name: string = "sohaib") {
        this.studentId = Id;
        this.studentName = Name;
    }
    Display() {
        console.log("Id: " + this.studentId + ", Name: " + this.studentName);
    }

}

let s: Student = new Student();
s.Display();

