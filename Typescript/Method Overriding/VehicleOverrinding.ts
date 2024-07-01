class Vehicle {
    run(): void {
        console.log("Vehicle is running...");
    }
}

class Bike extends Vehicle {

}

let b: Bike = new Bike();
b.run();