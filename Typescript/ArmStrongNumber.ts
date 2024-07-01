
function CountDigits(n) {
    let count: number = 0;
    while (n != 0) {
        n = Math.floor(n / 10);
        count++;

    }
    return count;
}

function Power(n, c) {
    let p: number = 1;
    while (c != 0) {
        p *= n;
        c--;
    }
    return p;
}

function ArmStrongNumber() {
    let n: number = 153;
    let c: number = CountDigits(n);
    let sum: number = 0;
    let rem: number = 0;
    let x: number = n;


    while (n != 0) {
        rem = n % 10;
        sum = sum + Power(rem, c);
        n = Math.floor(n / 10);
    }

    if (sum == x) {
        console.log(x + " is a Armstrong number.");
    } else {
        console.log(x + " is not a armstrong number");
    }
}
ArmStrongNumber();