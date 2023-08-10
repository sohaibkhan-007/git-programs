public class Strrev{


	public static void main(String args[]){
     String s = "sohaib";
     String reverse="";
     for(int i=s.length()-1;i>=0;i--){
     reverse=reverse+s.charAt(i);	
     }

     System.out.println(s);
     System.out.print(reverse);
	}
}