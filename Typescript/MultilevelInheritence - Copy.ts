interface Teacher {

    teachers: number;
}

interface Staff {
    workers: number;
}
class School implements Staff, Teacher {
    workers: number;
    teachers: number;
    students: number;
    totalPeople:number;
    constructor(workers: number, teachers: number, students: number) {

        this.workers = workers;
        this.teachers = teachers;
        this.students = students;
        this.totalPeople=workers+teachers+students;
    }

    SchoolInformation() {
        console.log(`Workers: ${this.workers},Teachers: ${this.teachers},studets: ${this.students},totalPeoples: ${this.totalPeople}`);

    }

}
let sc:School=new School(10,20,400);
sc.SchoolInformation();