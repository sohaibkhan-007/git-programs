function PrimeNumber() {
    let i: number;
    let n: number = 7;
    let c:number=0;

    for (i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            c++;
            console.log(n + " is not a prime number");
            break;
        }
    }
    if(c==0){
        console.log(n+" is a prime number ");
    }
}
PrimeNumber();