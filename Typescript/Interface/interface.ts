// interface House {

//     prperty: string;
//     owner(proprty: string):string;
// }

//---------------------------------------------------------//

interface Student {
    fname: string;
    lname: string;
    getFullName(): string;
}

class StudentImpl implements Student {
    fname: string;
    lname: string;
    getFullName(): string {
        return this.fname + " " + this.lname;
    }
}

var s: Student = new StudentImpl();
s.fname = "sohaib";
s.lname = "khan";
console.log(s.getFullName());