class Vehicle1 {
    run(): void {
        console.log("vehicle1 is running");
    }
}
class Bike2 extends Vehicle1 {
    run(): void {
        console.log("Bike is running safely..");
    }
}

let b: Bike2 = new Bike2();
b.run();