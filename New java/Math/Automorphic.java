public class Automorphic{
	
      public boolean  automorphic(int n){
      	Integer a=0,x=0,y=0,i=0,power=0;
      	Countdigits obj1= new Countdigits();
      	
        power=n*n;
       while(n!=0 && power!=0){
        
        x=n%10;
        y=power%10;
        if(x!=y){
        	return false;
        	
        }
        n=n/10;
        power=power/10;
       }
       return true;  
    }   
	
	public static void main(String[] args) {
		Automorphic obj = new Automorphic();

		System.out.println(obj.automorphic(76));

	}
}