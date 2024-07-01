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


}