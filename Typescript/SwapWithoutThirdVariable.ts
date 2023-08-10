function SwapWithoutThirdVariable() {
    //a=a+b(b=a); 
    let a: number = 10;
    let b: number = 20;
    a = a + b - (b = a);
    console.log(a);
    console.log(b);
}
SwapWithoutThirdVariable();