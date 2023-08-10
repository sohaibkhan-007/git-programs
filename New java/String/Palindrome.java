public class Palindrome{
	
	public static void main(String args[]){
		String s="abcaa";
			int f=0,l=s.length()-1,a=0;

			while(f!=l){
				if(s.charAt(f)==s.charAt(l)){
					f++;
					l--;
                  
				}
				else{
					a++;
					break;
				}
			}
        if(a==0){
        	System.out.println("String is palindrome");
        }		
        else
        {
        	System.out.println("Not palindrome.");
        	
        }
   
	}
}