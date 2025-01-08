package PROBLEM_TO_PRACTICE;
// Problem: Create a class named Book that represents a book in a library. The class should have the following attributes:

// title (String)
// author (String)
// price (double)
// The class should have the following methods:

// A constructor to initialize the attributes.
// A method displayDetails() that displays the book details.
// A method discountPrice(double percentage) that calculates the price after a discount is applied.
// Steps:

// Define the class Book.
// Create a constructor that initializes the title, author, and price.
// Implement displayDetails() to print book details.
// Implement discountPrice(double percentage) to return the discounted price.
// In the main method, create a Book object, display its details, and apply a discount.
import java.util.*;
class Book{
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;  // Correct assignment using 'this'
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Title of Book:"+title);
        System.out.println("Author of Book:"+author);
        System.out.println("Price of Book:"+price);
    }
    void discountPrice(double percentage){
        double disprice=price-(price*(percentage/100));
        
        System.out.println("Discount Price of Book:"+disprice);
    }
}
public class Prob22{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String title =sc.next();
        String author =sc.next();
        double price =sc.nextDouble();
        double percentage =sc.nextDouble();
        Book b= new Book( title, author, price);
        b.displayDetails();
        b.discountPrice(percentage);
    }
}

