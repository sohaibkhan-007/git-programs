/* class A extends Thread {
 	public void run(){
 		String name=Thread.currentThread().getName();
 		for(int i=1;i<=3;i++){
 			System.out.println(name+": "+i);

 		}
 	}
 }
public class JoinMethod {
	public static void main(String[] args) {
		A t1=new A();
		A t2=new A();
		A t3=new A();
		t1.start();
		t2.start();
		t3.start();
		String name=Thread.currentThread().getName();
 		for(int i=1;i<=3;i++){
 			System.out.println(name+": "+i);

 		}
		try{
		t2.join();	
		}
		catch( InterruptedException i){

		}
	}
}*/

class ThreadJoin extends Thread
{
	public void run(){
		for(int i=1;i<=3;i++){
			try{
				Thread.sleep(500);
				System.out.println("The current thread name is:"+Thread.currentThread().getName());
			}
			catch(Exception e){
				//System.out.println("The Exception has been caught:"+e);
			}
			System.out.println(i);
		}
	}
}
public class JoinMethod{
	public static void main(String[] args) {
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();
		ThreadJoin t3=new ThreadJoin();

		 t1.start();
		 try{
		 	//System.out.println("The Current Thread name is:"+Thread.currentThread().getName());
		 	t1.join(10000);
		 }
		 catch(Exception e){
		 	//cmd
		 	cSystem.out.println("The Exception is caught:"+e);
		 }
		 t2.start();
		//  try{
		//  	System.out.println("The Current Thread name is:"+Thread.currentThread().getName());
		// t2.join();
		//  }
		 // catch(Exception e){
		 // 	System.out.println("The Exception is caught:"+e);

		 // }
		t3.start();
		 
	}
}


