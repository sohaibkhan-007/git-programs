// function ReverseNumber() {
//     let n: number = 123;
//     let reverse: number =0;
//     let x: number = 0;
//     while (n != 0) {
//         x = (n % 10);
//         reverse*=10;
//         reverse = (reverse + x);
//         n = Math.floor(n / 10);
//     }
//     console.log(reverse);
// }
// ReverseNumber();

function ReverseNumber1() {
    let n: number = 700;
    let reverse: number = 0;
    let x: number = 0;
    while (n != 0) {
        x = (n % 10);
        reverse = reverse + x;
        n = Math.floor(n / 10);
    }
    console.log(reverse);
}
ReverseNumber1();