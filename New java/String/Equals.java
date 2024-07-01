public class Equals{
	
	public static void main(String []args){
		int a=10;
		int b=10;
		System.out.println(a==b); //true

		Integer c=127;
		Integer d=127;
		System.out.println(c==d);//true

    	Integer e=128;
		Integer f=128;
		System.out.println(c.equals(d));/*true =>In this 
		the equals method is comparing the values of object insted of 
		comparing objexcts because we have not overrided the equals methods.*/

		int g=128;
		int h=128;
		System.out.println(g.equals(h));/*As we have not overrided the equals method so 
		it will give error (int can not be dereffrenced).
        



	}
}