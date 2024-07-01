
public class StartMethod {
	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		t1.start();
		ThreadExample2 t2 = new ThreadExample2();
		t2.start();		
		
	}
}

class ThreadExample1 extends Thread{
	
	public void run(){
		String name=Thread.currentThread().getName();
		for(int i=1;i<=3;i++){
			System.out.println(name+": one "+i);
			Thread.yield();
		}
	}
}
class ThreadExample2 extends Thread{
	
	public void run(){
		String name=Thread.currentThread().getName();
		for(int i=1;i<=3;i++){
			System.out.println(name+": two "+i);
		}
	}
}