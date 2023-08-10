class Parent {
    protected color: string = "black";
    protected height: string = "5 feet,10 inches`";
    protected age: number = 40;
    protected gender: string;
    constructor(gender: string) {
        this.gender = gender;
    }
    DisplayParent() {
        console.log(`Color of parent: ${this.color},height of parent: ${this.height},age of parent: ${this.age},Gender: ${this.gender}`);

    }
}
class Child extends Parent {
    color: string = "brown";
    height: string = "6 feet";
    age: number = 10;

    constructor(gender: string) {
        super(gender);
        this.gender = gender;
    }

    DisplayChild() {
        console.log(`Color of child: ${this.color},height of child: ${this.height},age of child: ${this.age},Gender: ${this.gender}`);
    }


}
let p: Parent = new Parent("male");
let c: Child = new Child("male");
c.DisplayChild();
p.DisplayParent();