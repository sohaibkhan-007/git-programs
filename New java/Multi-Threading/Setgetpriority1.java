class A extends Thread{
	public void run(){
		for(int i=1;i<2;i++)
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());			

		}
    }
}
public class Setgetpriority1{
	public static void main(String[] args) {
		A t1=new A();
		A t2=new A();
		t1.start();
		t2.start();
		t2.setPriority(11);
	}
}