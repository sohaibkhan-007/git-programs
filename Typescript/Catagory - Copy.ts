class Catagory {
    catagoryId: number;
    catagoryName: String;
    // catagorySalary:number;
    constructor(id: number, name: string) {
        this.catagoryId = id;
        this.catagoryName = name;

    }
}

class Product {
    productId: number;
    productName: string;
    productPrice: number;
    productStock?: boolean;
    catagory?: Catagory;
    constructor(id: number, productName: string, productPrice: number, Stock?: boolean, catagory?: Catagory) {
        this.productId = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = Stock;
        this.catagory = catagory;
    }
    display(): void {
        console.log(`catagory Id: ${this.catagory?.catagoryId},catagory Name: ${this.catagory?.catagoryName}`);
        console.log(`product Id:${this.productId}, product name: ${this.productName},product Price:${this.productPrice}`);
    }
}

let cat: Catagory = new Catagory(101, "sohaib");
let prod: Product = new Product(1, "mobile", 10000, true);

prod.display();