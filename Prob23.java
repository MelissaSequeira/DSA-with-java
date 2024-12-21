/*Problem: Create a class Employee with the following attributes:

name (String)
salary (double)
Implement encapsulation by making these fields private and provide public getter and setter methods for each.

Steps:

Define the Employee class with private fields name and salary.
Provide getter and setter methods for name and salary.
In the main method, create an Employee object, set its name and salary using setter methods, and print the values using getter methods.*/
import java.util.*;

class EmployeeMan{
   private String name;
   private double salary;
   
  public void setName(String name){
    this.name=name;
   }
  public void setSalary(double salary){
this.salary=salary;
   };
  public void getName()
   {System.out.println("Employee name is:"+name);}
  public void getSalary()
   {
    System.out.println("Employee's salary is:"+salary);
   }
        // emp.
        // emp.setSalary();
}

public class Prob23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        double salary=sc.nextDouble();
        EmployeeMan emp = new EmployeeMan();
        emp.setName(name);
        emp.setSalary(salary);
        emp.getName();
        emp.getSalary();
    }
}
