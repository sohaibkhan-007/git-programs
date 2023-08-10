function SumOfDigits(){
    var n:number=123;
    var sum:number=0;
    var x:number;
    while(n!=0){
        x=Math.floor(n%10);
        n=n/10;
        sum=sum+x;
    }
    console.log(sum);
}
SumOfDigits();