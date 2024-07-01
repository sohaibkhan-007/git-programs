import java.util.Scanner;

class Employee {
    private int empId;
    private String name, designation, mobileNumber;

    Employee(int empId, String name, String designation, String mobileNumber) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.mobileNumber = mobileNumber;
    }

    public String toString() {
        return "\nName: " + name + " EmpId: " + empId + " Designation: " + designation + " Mobile Number: "
                + mobileNumber;
    }

    void setNewDesignation(String designation) {
        this.designation = designation;
    }

    void setNewEmpId(int empId) {
        this.empId = empId;
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

    String getDesignation() {
        return designation;
    }

    int getEmpId() {
        return empId;
    }

    String getMobileNumber() {
        return mobileNumber;
    }
}

class Company {
    Employee employees[];
    int capacity, totalEmployees;

    Company() {
        capacity = 5;
        totalEmployees = -1;
        employees = new Employee[capacity];
    }

    public static boolean matchEmpId(int empId, Employee employees[], int totalEmployees) {
        for (int i = 0; i <= totalEmployees; i++) {
            if (employees[i].getEmpId() == empId) {
                return true;
            }
        }
        return false;
    }

    public void newEmployee() {
        if (totalEmployees == capacity - 1) {
            capacity += 5;

            Employee temp[] = new Employee[capacity];
            for (int i = 0; i <= totalEmployees; i++) {
                temp[i] = employees[i];
            }
            employees = temp;
        }

        String name, designation, mobileNumber;
        int empId;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter employee ID:");
        empId = sc.nextInt();
        if (matchEmpId(empId, employees, totalEmployees)) {
            System.out.println("Employee ID already exists.");
            newEmployee();
            return;
        }

        sc.nextLine();
        System.out.println("Please enter employee name:");
        name = sc.nextLine();
        System.out.println("Please enter employee designation:");
        designation = sc.nextLine();
        System.out.println("Please enter employee mobile number:");
        mobileNumber = sc.nextLine();
        Employee emp = new Employee(empId, name, designation, mobileNumber);
        totalEmployees++;
        employees[totalEmployees] = emp;
    }

    void showEmployees() {
        for (int i = 0; i <= totalEmployees; i++) {
            System.out.println(employees[i]);
        }
    }

    void updateEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int empId = sc.nextInt();
        int i = 0;
        while (i <= totalEmployees) {
            if (employees[i].getEmpId() == empId) {
                System.out.println("Enter new employee ID:");
                empId = sc.nextInt();
                employees[i].setNewEmpId(empId);
                System.out.println("Enter new name:");
                sc.nextLine();
                String name = sc.nextLine();
                employees[i].setNewName(name);
                System.out.println("Enter new designation:");
                String designation = sc.nextLine();
                employees[i].setNewDesignation(designation);
                System.out.println("Enter new mobile number:");
                String mobileNumber = sc.nextLine();
                employees[i].setNewMobileNumber(mobileNumber);
                break;
            } else {
                i++;
            }
        }
    }

    void deleteEmployee() {
        System.out.println("Enter employee ID to delete:");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        int i = 0;

        while (i <= totalEmployees) {
            if (employees[i].getEmpId() == empId) {
                for (int j = i; j < totalEmployees; j++) {
                    employees[j] = employees[j + 1];
                }
                totalEmployees--;
                break;
            } else {
                i++;
            }
        }
    }

    void searchEmployee() {
        System.out.println("Enter employee ID to search:");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        int i = 0;
        int found = 0;
        while (i <= totalEmployees) {
            if (employees[i].getEmpId() == empId) {
                found++;
                System.out.println(employees[i]);
                break;
            } else {
                i++;
            }
        }
        if (found == 0) {
            System.out.println("No employee found with the given ID.");
        }
    }
}

public class EmployeeModule1 {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1: Add New Employee");
            System.out.println("2: Show Employee Information");
            System.out.println("3: Update Employee Information");
            System.out.println("4: Delete Employee");
            System.out.println("5: Search Employee");
            System.out.println("6: Exit");
            System.out.print("=> Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    company.newEmployee();
                    break;
                case 2:
                    company.showEmployees();
                    break;
                case 3:
                    company.updateEmployee();
                    break;
                case 4:
                    company.deleteEmployee();
                    break;
                case 5:
                    company.searchEmployee();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
