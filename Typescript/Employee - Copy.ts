class Employee {
    name: string;
    id: number;
    protected basicSalary: number;

    constructor(name: string, id: number, empSalary: number) {
        this.name = name;
        this.id = id;
        this.basicSalary = empSalary
    }

    callSalary(hours: number): number {
        return this.basicSalary + (hours * 1000);

    }

    Display() {
        console.log(`name:${this.name},ID:${this.id},salary:${this.basicSalary}`);
    }


}

class Trainer extends Employee {

    spaciality: string;

    constructor(Spaciality: string, emp: Employee) {
        super(emp.name, emp.id, emp.callSalary(2));
        this.spaciality = Spaciality;
    }
    Display() {
        console.log(`name:${this.name},ID:${this.id},salary:${this.basicSalary},spaciality:${this.spaciality}`);
    }

}
let e: Employee = new Employee("sahil", 101, 5000);
let t: Trainer = new Trainer("java", e);
e.Display();
t.Display();
