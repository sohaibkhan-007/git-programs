class Boy {

    name: string;
    about(): void {
        console.log(this.name + " is an intelligent boy...");
    }

}

class Student extends Boy {
    rollNo: number;
    marks: number;

    constructor(rollNo: number, marks: number, name1: string) {
        super();
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name1;
    }
    about(): void {
        super.about();
        console.log(this.name + " scored well..");
    }
    Display() {
        console.log("name: " + this.name + ", roll number: " + this.rollNo + ", Scores: " + this.marks + " out of 100");

    }
}

let std: Student = new Student(101, 90, "sohiab");
std.Display();
std.about();