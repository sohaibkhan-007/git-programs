interface car {
    engine: string;
    wheel: string;
}

class Toyota implements car {
    engine: string;
    wheel: string;
    carName: String;
    constructor(engine: string, wheel: string, carName: string) {
        this.engine = engine;
        this.wheel = wheel;
        this.carName = carName;
    }
    Display() {
        console.log(`Engine: ${this.engine},Wheel: ${this.wheel},carName: ${this.carName}`);
    }
}
class Suzuki implements car {
    engine: string;
    wheel: string;
    carName: String;
    constructor(engine: string, wheel: string, carName: string) {
        this.engine = engine;
        this.wheel = wheel;
        this.carName = carName;
    }
    Display() {
        console.log(`Engine: ${this.engine},Wheel: ${this.wheel},carName: ${this.carName}`);
    }
}

let toyota: Toyota = new Toyota("Devel Sixteen", "Steel wheels", "Fortuner");
let suzuki: Suzuki = new Suzuki("v8 engine", "Alloy Wheels", "Swift");
toyota.Display();
suzuki.Display();