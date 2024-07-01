class GrandParent {
    grandFatherName: string = "Ankit Trivedi";
    grandMotherName: string = "Anita Trivedi";
}
class Parent1 extends GrandParent {
    fatherName = "Anup Trivedi";
    motherName = "Komal Trivedi";
}
interface Children {
    habbits: string;
    teenage: boolean;

}
class Child1 extends Parent1 implements Children {
    childName1 = "Ashwin Trivedi.";
    childName2 = "Anuradha Trivedi.";
    habbits: string;
    teenage: boolean;
    constructor(habbits: string, teenage: boolean) {
        super();
        this.habbits = habbits;
        this.teenage = teenage;
    }
    DisplayChildrens() {
        console.log(`boy child:${this.childName1},girl child:${this.childName2},habbits of child's:${this.habbits},Teenagers:${this.teenage}`)
    }
    DisplayParents() {
        console.log(`Father name is:${this.fatherName},mother name:${this.motherName}`);
    }
    DisplayGrandParent() {
        console.log(`GrandFather name is:${this.grandFatherName},Grandmother name is:${this.grandMotherName}`);
    }
}

let c: Child1 = new Child1("Video games", true);
c.DisplayChildrens();
c.DisplayParents();
c.DisplayGrandParent();