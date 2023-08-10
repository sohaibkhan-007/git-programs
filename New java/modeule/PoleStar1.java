import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

class StudentModule {
    private static final String FILE_PATH = "students.dat";

    public void addStudent(Student student) {
        try {
            List<Student> students = readStudents();
            if (isRollNumberExists(students, student.getRollNumber())) {
                System.out.println("A student with the same roll number already exists.");
            } else {
                students.add(student);
                saveStudents(students);
                System.out.println("Student added successfully.");
            }
        } catch (IOException e) {
            System.out.println("Failed to add student: " + e.getMessage());
        }
    }

    public void displayStudents() {
        try {
            List<Student> students = readStudents();
            if (students.isEmpty()) {
                System.out.println("No students found.");
            } else {
                System.out.println("Student List:");
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to display students: " + e.getMessage());
        }
    }

    private List<Student> readStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            students = (List<Student>) ois.readObject();
        } catch (ClassNotFoundException | FileNotFoundException e) {
            // File does not exist or is empty, return an empty list
        }
        return students;
    }

    private void saveStudents(List<Student> students) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(students);
        }
    }

    private boolean isRollNumberExists(List<Student> students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentModule studentModule = new StudentModule();

        while (true) {
            System.out.println("\nStudent Module");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = sc.nextLine();
                    System.out.println("Enter roll number:");
                    int rollNumber = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    Student student = new Student(name, rollNumber);
                    studentModule.addStudent(student);
                    break;
                case 2:
                    studentModule.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
