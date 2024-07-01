function Palindrome() {
    let n: number = 121;
    let a: number = n;
    let sum: number = 0;

    while (n != 0) {
        sum = (sum + (n % 10)) * 10;
        n = Math.floor(n / 10);
    }
    sum = Math.floor(sum / 10);
    if (sum == a) {
        console.log(a + " is a palindrome number");
    } else {
        console.log(a + " is not a palindrome number");
    }
}
Palindrome();