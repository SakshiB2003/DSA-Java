import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String joinDate;
    char desigCode;
    String dept;
    int basic;
    int hra;
    int it;

    public Employee(int empNo, String empName, String joinDate, char desigCode, String dept, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.desigCode = desigCode;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public String getDesignation() {
        switch (desigCode) {
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case 'm':
                return "Manager";
            default:
                return "Unknown";
        }
    }

    public int calculateSalary() {
        int da = getDesignationAllowance();
        return basic + hra + da - it;
    }

    private int getDesignationAllowance() {
        switch (desigCode) {
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 15000;
            case 'm':
                return 40000;
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("%-8d%-10s%-15s%-15s%d", empNo, empName, dept, getDesignation(), calculateSalary());
    }
}

public class Project1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
                new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
                new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
                new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
                new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
                new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
                new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the employee ID: ");

            if (scanner.hasNextInt()) {
                int empId = scanner.nextInt();
                displayEmployeeDetails(empId, employees);
            } else {
                System.out.println("Invalid input. Please enter a valid integer for employee ID.");
            }
            scanner.close();
        } else {
            System.out.println("Invalid number of arguments. Please provide the employee ID.");
        }
        
    }

    private static void displayEmployeeDetails(int empId, Employee[] employees) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empNo == empId) {
                System.out.println("Emp No. Emp Name   Department     Designation    Salary");
                System.out.println(emp.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("There is no employee with empid: " + empId);
        }
        
        
    }
    
}