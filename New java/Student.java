 import java.util.*;
 class Student{
	 private int rollNo,fees;
	 private String name,className,mobileNumber;

	 Student(int rollNo,String name,String className,String mobileNumber)
	 {
        this.name=name;
        this.rollNo=rollNo;
        this.className=className;
        this.mobileNumber=mobileNumber;
	 }
      
      public String toString(){
      	return "\nname: "+name+"rollNo: "+rollNo+"className: "+className+"mobileNumber: "+mobileNumber;
      }

}

class School
{
	Student students[];
	int seat,totalStd;
    
    School()
    {
    	seat=2;
    	totalStd=-1;
    	students =new Student[seat]; 
    }
    public void newStudent()
    {
    	if(totalStd==seat-1)
    	{
    		System.out.println("sorry,come back next year");
    		return;
    	}

    	String n,m,c;
    	int r;
        Scanner sc = new Scanner(System.in);
    	System.out.println("plz Enter student roll number");
    	r = sc.nextInt();
    	System.out.println("plz Enter student name");
    	n = sc.nextLine();
    	System.out.println("plz Enter class name");
    	c = sc.nextLine();
        System.out.println("plz Enter phone number");
    	m = sc.nextLine();
    	Student s=new Student(r,n,m,c);
    	totalStd++;   
    	students[totalStd]=s;
    }
    void show(){
    	for(int i =0;i<totalStd;i++){
    		System.out.println(students[i]);
    	}
    }
}

public class Studentmodule{

	public static void main(String []args){
		//System.out.println(s);

	}
}

