import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class School {
    private static final String FILE_PATH = "std.obj";

    public void addData(Student student) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = readData();
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
        saveData(students);
    }

    public ArrayList<Student> readData() throws IOException, ClassNotFoundException {
        ArrayList<Student> students = null;
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                students = (ArrayList<Student>) ois.readObject();
            }
        }
        return students;
    }

    public Student findStudent(int rollNum) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = readData();
        if (students != null) {
            for (Student student : students) {
                if (student.getRollNo() == rollNum) {
                    return student;
                }
            }
        }
        return null;
    }

    public void update() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number:");
        int rollNumber = sc.nextInt();
        Student student = findStudent(rollNumber);
        if (student != null) {
            System.out.println("Enter new roll number:");
            int newRollNo = sc.nextInt();
            student.setRollNo(newRollNo);
            ArrayList<Student> students = readData();
            int index = students.indexOf(student);
            students.set(index, student);
            saveData(students);
            System.out.println("Student record updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void delete() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number to delete:");
        int rollNumber = sc.nextInt();
        ArrayList<Student> students = readData();
        if (students != null) {
            Student student = findStudent(rollNumber);
            if (student != null) {
                students.remove(student);
                saveData(students);
                System.out.println("Student record deleted.");
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No student records found.");
        }
    }

    private void saveData(ArrayList<Student> students) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(students);
        }
    }
}

class Student implements Serializable {
    private String name;
    private String kaksha;
    private String phoneNo;
    private int rollNo;

    public Student(String name, String kaksha, String phoneNo, int rollNo) {
        this.name = name;
        this.kaksha = kaksha;
        this.phoneNo = phoneNo;
        this.rollNo = rollNo;
    }

    // Getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + kaksha + ", " + phoneNo + ", " + rollNo + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter class:");
                    String kaksha = sc.next();
                    System.out.println("Enter phone number:");
                    String phoneNo = sc.next();
                    System.out.println("Enter roll number:");
                    int rollNo = sc.nextInt();
                    Student student = new Student(name, kaksha, phoneNo, rollNo);
                    school.addData(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    school.update();
                    break;
                case 3:
                    school.delete();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
