enum CourseNames {
    java, Dot, Testing
}

class Student {
    name: string;
    age: number;
    course: CourseNames;
}

var s: Student = new Student();
s.name = "sohiab";
s.age = 30;
s.course = CourseNames.java;

console.log(s.name);
console.log(s.age);
console.log(CourseNames[s.course]);