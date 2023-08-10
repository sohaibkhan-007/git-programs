class Test{
	int a;
	
	void m1()
	{
		System.out.println("m1: "+a);	
	}
	

   public static void main(String[] args){
   	Test obj1 = new Test();
   	Test obj2 = new Test();
   	obj1.a=100;
   	obj2.a=200;
   	obj1.m1();
   	obj2.m1();
   }
}