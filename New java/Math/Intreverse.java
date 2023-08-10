public class Intreverse{

	public int reverse(int n){

		Integer a=0,sum=0;
		while(n!=0){
			a=n%10;
			sum=sum*10+a;
			n=n/10;		
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Integer r=1234;
		Intreverse obj = new Intreverse();
       
       System.out.println(obj.reverse(r));
	}
}