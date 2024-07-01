
// public class MethodLocalInnerClasses{
// 	 int data=10;
// 	void display(){
// 		class Local{
// 			void msg(){	
// 				System.out.println(data);
// 			}
// 		}
// 		Local l=new Local();
// 		l.msg();
// 		}	
// 	public static void main(String[] args) {
// 		MethodLocalInnerClasses m=new MethodLocalInnerClasses();
// 		m.display();
		
// 	}
// }

class MethodLocalInnerClasses{

	private int data=30;
	void display(){
		int value=50;
		class Local{
			void msg(){
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	}
	public static void main(String[] args) {
		MethodLocalInnerClasses obj=new MethodLocalInnerClasses();
		obj.display();
	}
}