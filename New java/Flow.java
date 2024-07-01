 class Flow{
	int a=10;
	static{
     System.out.println("hello static");
	}
	Flow(){
		System.out.println(a);
		System.out.println("hello constructor.");
	}
	{
		System.out.println("hello non static");
	}
	public static void main(String []args){
		Test t= new Test();
		System.out.println("hello main");
		Flow f=new Flow();
	}
}
class Test extends Flow{
	Test()
	{
		this(12);
		System.out.println("hello sir");
	}
	Test(int a){
		System.out.println(a);
		System.out.println("Hello constructor");
	}
}