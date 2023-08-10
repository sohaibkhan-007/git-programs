public class Upperalpha{

	public static void main(String args[]){
       char ch;
       String s="SOHAIB";
	   for(int i=0;i<s.length();i++){
       int  ascii=(int) s.charAt(i);
       if(ascii>=65 && ascii<=90){
       ascii=ascii+32;
        ch=(char)ascii;	
   }
   else{
   	ascii=ascii-32;
   	ch=(char)ascii;
   }
   System.out.print(ch);
}
	

	}
	
}