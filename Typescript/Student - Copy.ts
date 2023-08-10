class Student {
    studentName: string;
    studentRank: number;
    studentMarks: number;

    getStudentGrade(): string {
        if (this.studentMarks >= 75) {
            return "A";
        } else if (this.studentMarks >= 65 && this.studentMarks < 60) {
            return "B";
        } else {
            return "c";
        }
    }
}
let s1 = new Student();
s1.studentMarks = 80;
s1.studentName = "sohaib";
s1.studentRank = 100;
console.log(s1.studentMarks);
console.log(s1.getStudentGrade());

let s2=new Student();
s2.studentMarks=77;
s2.studentName="Imran";
s2.studentRank=100;
console.log(s1.studentName);
console.log(s1.getStudentGrade());