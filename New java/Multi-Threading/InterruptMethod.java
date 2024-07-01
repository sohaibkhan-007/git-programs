class A extends Thread{
	public void run(){
		try{
		for(int i=1;i<3;i++){
			System.out.println("t1 thread is running");
			Thread.sleep(1000);//The thread t1 goes to waiting state.
		 }	
		}catch(InterruptedException ie){
			System.out.println("Thread t1 is terminated...");

		}
	}
}
public class InterruptMethod{
	public static void main(String[] args) {
		A t1=new A();
		t1.start();
		t1.interrupt();
		
	}
}