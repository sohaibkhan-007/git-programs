// interface Person{
// 	void show();	
// }

// public class Annonymeouss{
// 	public static void main(String[] args) {
// 		Person p =new Person(){
// 			public void show(){
// 				System.out.println("Annonymeouss class");
// 			}
// 		};
// 		p.show();
// 	}
// } 


class ChinesePoint{
	public void noodels(){
		System.out.println("Normal Taste");
	}
}
public class Annonymeouss{
	public static void main(String[] args) {
		new ChinesePoint(){
			public void noodels(){
				System.out.println("spicy Taste");
			}
		}.noodels();

		new ChinesePoint().noodels();
	}
} 
// class Annonymeouss{
// 	public static void main(String[] args) {

// 		new Thread(new Runnable(){
// 			public void run(){
// 				for(int i=1;i<=3;i++){
// 					System.out.println(Thread.currentThread().getName()+": "+
// 						i);
// 				}
// 			}
// 		}).start();
//    for(int i=1;i<=3;i++){
// 	System.out.println(Thread.currentThread().getName()+": "+i);
//         }
//     }
// }

// public class Annonymeouss{
// 	public static void main(String[] args) {
// 		Thread t=new Thread(new Runnable(){
// 			public void run(){
// 				System.out.println("Annonymeouss thread is running.");
// 			}
// 		});
// 		t.start();
// 	}
// }

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Annonymeouss {
//     public static void main(String[] args) {
//         JButton button = new JButton("Click me!");

//         button.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.out.println("Button clicked!");
//             }
//         });

//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(button);
//         frame.pack();
//         frame.setVisible(true);
//     }
// }

	
