class Outer{
	private int m=10;

	class Inner{

		public void m1(){
			System.out.println(m+"Is a private member of outer class an accesed ini inner class.");
		}
	}
}

public class OuterClass{
	public static void main(String[] args) {
		Outer.Inner in=new Outer().new Inner();
		in.m1();
	}
}