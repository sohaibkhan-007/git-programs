import java.util.Scanner;

public class Userinput{

	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name =input.next();
		System.out.println("Enter gender: ");
		char gender = input.next().charAt(0);
		System.out.println("Enter age: ");
		int age = input.nextInt();
		System.out.println("Enter number: ");
		long number = input.nextLong();
		System.out.println("name:"+name);
		System.out.println("Gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("Phone number: "+number);
	}

}