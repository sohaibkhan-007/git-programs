import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class school {
    public void addData(Student s) throws Exception {
        ArrayList al = readData();
        if (al == null) {
            al = new ArrayList();
        }
        al.add(s);
        FileOutputStream fos = new FileOutputStream("std.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close();
    }

    public ArrayList readData() {
        try {
            FileInputStream fis = new FileInputStream("std.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList al = (ArrayList) ois.readObject();
            return al;
        } catch (Exception e) {
            return null;
        }

    }
    public Student match(int rollNum){
        ArrayList al=readData();
        for(int i=0;i<al.size();i++){
            Student std=(Student)al.get(i);
            if(rollNum==std.getrollNo())
                return std;
        }
        return null;


    }
    public void addNewData(ArrayList all) throws Exception{
        FileOutputStream fos = new FileOutputStream("std.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(all);
        oos.close();


    }

    public void update() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll NUmber:");
        int rollnumber=sc.nextInt();
        Student s= match(rollnumber);
        System.out.println("Enter new RollNUmber");
        int newRollNo=sc.nextInt();
        s.setrollNo(newRollNo);
        ArrayList al=readData();
        int index=al.indexOf(s);
        al.set(index,s);
        school schl=new school();
        addNewData(al);

        
    }

}

class Student implements Serializable {
    String name;
    String kaksha;
    String phonNo;
    int rollNo;

    public String toString() {
        return "(" + name + ", " + kaksha + ", " + phonNo + ", " + rollNo + ")";
    }

    Student(String name, String kaksha, String phonNo, int rollNo) {
        this.name = name;
        this.kaksha = kaksha;
        this.phonNo = phonNo;
        this.rollNo = rollNo;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setkaksah(String kaksha) {
        this.kaksha = kaksha;
    }

    public void setphonNo(String phonNo) {
        this.phonNo = phonNo;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getkaksha() {
        return kaksha;
    }

    public String getphonNO() {
        return phonNo;
    }

    public int getrollNo() {
        return rollNo;
    }

}

public class PoleStar {

    public static void main(String[] args) throws Exception {
        school s = new school();

        //Student so = new Student("soahib", "Tenth.", "965434567", 21);
        // s.addData(so);
        s.update();
        ArrayList al = s.readData();
        for (int i = 0; i < al.size(); i++) {
               System.out.println(al.get(i));
        }

    }
}