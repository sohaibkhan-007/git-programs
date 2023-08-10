function Factorial(x) {
    let f: number = 1;
    let i: number = 1;
    for (i = 1; i <= x; i++) {
        f = f * i;
    }
    return f;
}
function StrongNumber() {
    let n: number = 145;
    let sum: number = 0;
    let x: number = 0;
    let a: number = n;

    while (n != 0) {
        x = n % 10;
        n = Math.floor(n / 10);
        sum += Factorial(x);
    }
    if (sum == a) {
        console.log(sum + " is a strong number.");
    }
}
StrongNumber();