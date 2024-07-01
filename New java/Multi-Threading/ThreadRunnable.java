//multi-threading by Runnable Enterface in java
 

class A implements Runnable{
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}

public class ThreadRunnable{
	
	public static void main(String[] args) {
		A t=new A();
		Thread t1=new Thread(t);
		t1.start();
		// try{
		// t1.join();	
		// }
		// catch(Exception e){

		// }

		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}