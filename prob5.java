import java.util.*;

abstract class pay {
    abstract void payroll(int empid, String empName, int hrs, int sal);
}

class parttime extends pay {
    void payroll(int empid, String empName, int hrs, int sal) {
        int deduction = 2000;
        System.out.println("Parttime Employee Payroll Details:");
        System.out.println("Total salary: " + ((sal * hrs) - deduction));
    }
}

class Fulltime extends pay {
    void payroll(int empid, String empName, int hrs, int sal) {
        int allowance = 5000;
        int deduction = 2000;
        System.out.println("Fulltime Employee Payroll Details:");
        System.out.println("Total salary: " + ((sal * hrs + allowance) - deduction));
    }
}

class Intern extends pay {
    void payroll(int empid, String empName, int hrs, int sal) {
        System.out.println("Intern Employee Payroll Details:");
        System.out.println("Total salary: " + ((sal * hrs)));
    }
}

public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter # for Parttime Employee");
        System.out.println("2.Enter @ for Fulltime Employee");
        System.out.println("3.Enter * for Intern Employee");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '@':
                pay p1 = new Fulltime();
                System.out.println("Enter Employee ID:");
                int eid1 = sc.nextInt();
                System.out.println("Enter Employee Name:");
                String ename1 = sc.next();
                System.out.println("Enter hours worked:");
                int hrs1 = sc.nextInt();
                System.out.println("Enter salary per hour:");
                int sal1 = sc.nextInt();
                p1.payroll(eid1, ename1, hrs1, sal1);
                break;
            case '#':
                pay p2 = new parttime();
                System.out.println("Enter Employee ID:");
                int eid2 = sc.nextInt();
                System.out.println("Enter Employee Name:");
                String ename2 = sc.next();
                System.out.println("Enter hours worked:");
                int hrs2 = sc.nextInt();
                System.out.println("Enter salary per hour:");
                int sal2 = sc.nextInt();
                p2.payroll(eid2, ename2, hrs2, sal2);

                break;

            case '*':
                pay p3 = new Intern();
                System.out.println("Enter Employee ID:");
                int eid3 = sc.nextInt();
                System.out.println("Enter Employee Name:");
                String ename3 = sc.next();
                System.out.println("Enter hours worked:");
                int hrs3 = sc.nextInt();
                System.out.println("Enter salary per hour:");
                int sal3 = sc.nextInt();
                p3.payroll(eid3, ename3, hrs3, sal3);
            default:
                break;
        }

    }
}
