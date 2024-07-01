class A extends Thread{
	public void run(){
		String name=Thread.currentThread().getName();
		for(int i=1;i<3;i++){
			System.out.println(name);
		}
	}
}


public class IsAliveMethod {
	public static void main(String[] args) {
		A t1=new A();
		A t2 =new A();
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t2.start();
	}
}