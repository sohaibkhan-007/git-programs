import { Student } from "/Angular/Typescript/export2"
class School {
    student: Student[] = [
        new Student(101, "sohaib"),
        new Student(102, "sahil"),
        new Student(103, "nilesh"),
    ];

    display(): void {
        for (var i in this.student) {
            console.log(this.student[i]);
        }
    }
}

let school: School = new School();
school.display();