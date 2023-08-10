function NumberTriangle() {
    let i: number;
    let j: number;
    let k: number;
    let l: number;
    let n: number=5;
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n - i; j++) {
            console.log(" ");
        }
        for (k = 1; k <= i; k++) {
            console.log("%d", k);
        }
        for (l = i - 1; l >= 1; l--) {
            console.log("%d", l);
        }
        console.log("\n");
    }
    return 0;
}  

NumberTriangle();