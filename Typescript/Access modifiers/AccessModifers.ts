class Student {
    public studentId: number = 101;
    private studentName: string = "sohaib";
    protected marks: number = 80;

    public Display(): void {
        console.log("-------------------Student Details:Parent-----------------------");
        console.log(this.studentId);
        console.log(this.studentName);
        console.log(this.marks);
    }
}

class EngStudent extends Student {

    public Display2(): void {

        console.log("--------------Student Details:Child----------------");
        console.log(this.studentId);
        // console.log(this.studentName);
        console.log(this.marks);
    }
}

class Test {
    sampleMethod() {
        var s1 = new Student();
        s1.Display();

        
        
        var s2 = new EngStudent();
        s2.Display2();
        
        
        
        console.log("--------------------------");
        console.log("--------------------------------");
            console.log(s1.studentId);
            //  console.log(s1.studentName);
            //  console.log(s1.marks);

        
    }
}

var t: Test = new Test();
t.sampleMethod();