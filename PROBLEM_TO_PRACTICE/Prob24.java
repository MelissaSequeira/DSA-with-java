package PROBLEM_TO_PRACTICE;
/*Problem: Create a class Shape with a method area() that returns 0 (as a generic shape doesn't have a specific area). 
Then, create two subclasses, Circle and Rectangle, that override the area() method to calculate the area of a circle and 
a rectangle, respectively.

Steps:

Define the Shape class with an area() method.
Create the Circle subclass with a radius field and override the area() method.
Create the Rectangle subclass with length and width fields and override the area() method.
In the main method, create objects of Circle and Rectangle and call their area() methods.*/

import java.util.*;
class Shape{
  void area(){
    System.out.println("parent class of Cirlce and Rectangle.");
  }
}
class Circle extends Shape{
  void area(double radius){
    double a=3.17*radius*radius;
    System.out.println("Area of Circle:"+a);
  }
}
class Rectangle extends Shape{
  void area(double length, double breadth){
    double a=length*breadth;
    System.out.println("Area of Rectangle:"+a);
  }
}
public class Prob24{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double rad=sc.nextDouble();
    double l=sc.nextDouble();
    double b=sc.nextDouble();
    Rectangle r = new Rectangle();
    Circle c= new Circle();
    c.area(rad);
    r.area(l,b);

  }
}