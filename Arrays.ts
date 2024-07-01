let fruits: string[];
fruits = ['mango', 'apple', 'banana', 'watermelon'];
console.log(fruits);

let animal: Array<string>;
animal = ['tiger', "lion", "Eliphant"];
console.log(animal);

let genericArray: Array<string | number | boolean>;
genericArray = ["Fruits", 100, true];
console.log(genericArray);

for (let i = 0; i <= 2; i++) {
    console.log(genericArray[i]);
}