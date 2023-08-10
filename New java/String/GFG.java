import java.io.*;
import java.util.Scanner;
 
class GFG {
    public static void main (String[] args) {
       
        String str= "Geeks for nilesh", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }

     for(i=0;i<nstr.length();i++){
       if(nstr.charAt(i)==' ');{
        
       }
     }
      System.out.println("Reversed word: "+ nstr);
    }
}