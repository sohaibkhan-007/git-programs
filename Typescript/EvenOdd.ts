function EvenOdd() {
    let i: number ;
    
    for (i = 0; i <= 10; i++) {
        if (i % 2 == 0) {
            console.log(i+" is a even number");
        }else{
            console.log(i+" is odd number");
        }
    }
}
EvenOdd();