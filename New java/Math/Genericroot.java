public class Genericroot{

	public static void main(String[] args){
		Integer num=111,a=0,sum=0;
		while(num!=0){
          a=num%10;
          sum=sum+a;
          num=num/10;
		}
		System.out.println(sum);
	}
  	
	}
