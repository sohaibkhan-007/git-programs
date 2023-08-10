import java.util.*;

import javax.swing.text.PlainDocument;

class Student {
    private int rollNo, fees;
    private String name, className, mobileNumber;

    Student(int rollNo, String name, String className, String mobileNumber) {
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.mobileNumber = mobileNumber;
    }

    public String toString() {
        return "\nname: " + name + " rollNo: " + rollNo + " className: " + className + " mobileNumber: " + mobileNumber;
    }

    void setNewClassName(String className) {
        this.className = className;
    }

    void setNewRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setNewName(String name) {
        this.name = name;
    }

    void setNewMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    String getName() {
        return name;
    }

    String getClassName() {
        return className;
    }

    int getRollNo() {
        return rollNo;
    }

    String getMobileNumber() {
        return mobileNumber;
    }
}

class School {
    Student students[];
    int seat, totalStd;

    School() {
        seat = 5;
        totalStd = -1;
        students = new Student[seat];
    }

    public static boolean matchRollNO(int f) {
        for (int i = 0; i <= totalStd; i++) {
            if (students[i].getRollNo == f) {
                return true;
            } else {
                return false;
            }
        }

    }

    public void newStudent() {
        if (totalStd == seat - 1) {
            seat += 5;

            Student s[] = new Student[seat];
            for (int i = 0; i <= totalStd; i++) {
                s[i] = students[i];
            }
            students = s;
            return;
        }
        String n, m, c;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("plz Enter student roll number");
        r = sc.nextInt();
        if (matchRollNO(r)) {
            System.out.println("Roll number already exixt.");
            newStudent();
            return;
        }

        sc.nextLine();
        System.out.println("plz Enter student name");
        n = sc.nextLine();
        System.out.println("plz Enter class name");
        c = sc.nextLine();
        System.out.println("plz Enter phone number");
        m = sc.nextLine();
        Student s = new Student(r, n, c, m);
        totalStd++;
        students[totalStd] = s;
    }

    void show() {
        for (int i = 0; i <= totalStd; i++) {
            System.out.println(students[i]);
        }

    }

    void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student rollNo:");
        Integer r = sc.nextInt();
        String str = "";
        int i = 0;
        while (i <= totalStd) {
            int f = 0;
            if (students[i].getRollNo() == r) {
                while (true) {

                    System.out.println("enter new roll number:");
                    r = sc.nextInt();
                    students[i].setNewRollNo(r);
                    System.out.println("enter new name:");
                    sc.nextLine();
                    str = sc.nextLine();
                    students[i].setNewName(str);
                    System.out.println("enter new class name:");
                    str = sc.nextLine();
                    students[i].setNewClassName(str);
                    System.out.println("enter new Mobile number:");
                    str = sc.nextLine();
                    students[i].setNewMobileNumber(str);
                    f = 1;
                    if (f == 1)
                        break;
                }
            } else {
                i++;
            }
            if (f == 1)
                break;
        }
    }

    void delete() {

        System.out.println("Enter student roll number to delete:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i = 0;

        while (i <= totalStd) {
            if (students[i].getRollNo() == r) {
                students[i] = students[i + 1];
                totalStd--;
            } else {
                i++;
            }
        }
    }

    void Searche() {
        int i = 0, f = 0;
        System.out.println("Enter student rollno: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        while (i <= totalStd) {
            if (students[i].getRollNo() == r) {
                f++;
                System.out.println(students[i]);
                break;
            }

            else {
                i++;
            }
        }
        if (f == 0) {
            System.out.println("no such student found.");
        }

    }

}

public class Studentmodule {

    public static void main(String[] args) {
        School school = new School();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1:Create Student:");
            System.out.println("2:Read/Show information of student:");
            System.out.println("3:Update information of student:");
            System.out.println("4:Delete Student:");
            System.out.println("5:Search Student:");
            System.out.println("6:Exit:");
            System.out.print("=>Enter the choice:");
            Integer c = sc.nextInt();
            switch (c) {
                case 1:
                    school.newStudent();
                    break;
                case 2:
                    school.show();
                    break;
                case 3:
                    school.update();
                    break;
                case 4:
                    school.delete();
                    break;
                case 5:
                    school.Searche();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
