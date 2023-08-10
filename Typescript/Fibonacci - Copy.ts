function Fibonacci() {
    let i: number = 0;
    let j: number = 1;
    let k: number = 0;
    let n: number = 21;
    while (k <= n) {
        k = j + i;
        console.log(k);
        i = j;
        j = k;
    }
}
Fibonacci();