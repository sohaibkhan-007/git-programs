import java.util.*;

import javax.print.DocFlavor.STRING;

class Employee {
    private String name, mobileNumber, employeeId;
    private int salary;

    Employee(String name, String mobileNumber, String employeeId, int salary) {
        this.employeeId = employeeId;
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "\nName: " + name + " Employee Id: " + employeeId + " Mobile Number:" + mobileNumber + " Salary: "
                + salary;
    }

    void setID(String ID) {
        this.employeeId = ID;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMobNum(String m) {
        this.mobileNumber = m;
    }

    void setSalary(int s) {
        this.salary = s;
    }

    public String getId() {
        return employeeId;

    }

}

class Company {
    Employee employes[];
    int totalEmployes, jobs;

    Company() {
        int jobs = 2;
        int totalEmployes = -1;
        employes = new Employee[jobs];

    }

    /*
     * public int matchEmployeeID(String Id) {
     * // Company t = new Company();
     * 
     * for (int i = 0; i <= totalEmployes; i++) {
     * if (employes[i].getId() == Id) {
     * return i;
     * }
     * }
     * return -1;
     * 
     * }
     */
    public void newJobs() {
        if (totalEmployes == jobs - 1) {
            System.out.println("No Jobs Available.");
            return;
        }

        String n, m, eId;
        int s;
        ++totalEmployes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        n = sc.nextLine();
        System.out.println("Enter the Employee Mobile Number: ");
        m = sc.nextLine();
        System.out.println("Enter the Employee ID: ");
        eId = sc.nextLine();
        System.out.println("Enter the Employee salary: ");
        s = sc.nextInt();
        Employee e = new Employee(n, m, eId, s);
        employes[totalEmployes] = e;

    }

    void show() {
        for (int i = 1; i <= totalEmployes; i++) {
            System.out.println(employes[i]);
        }

    }

    void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employe ID:");
        String ID = sc.nextLine();
        for (int i = 0; i <= totalEmployes; i++) {
            if (employes[i].getId() == ID) {
                System.out.println("Enter new ID: ");
                ID = sc.nextLine();
                employes[i].setID(ID);
                System.out.println("Enter the Employee Name: ");
                String n = sc.nextLine();
                employes[i].setName(n);
                System.out.println("Enter the Employee Mobile Number: ");
                String m = sc.nextLine();
                employes[i].setMobNum(m);
                System.out.println("Enter the Employee salary: ");
                int s = sc.nextInt();
                employes[i].setSalary(s);
            }
        }

    }

}

public class EmployeeMOdule {

    public static void main(String[] args) {
        Company c = new Company();
        c.newJobs();
        c.show();
        // c.update();
        // c.show();
    }

}