/*Problem: Create an abstract class Appliance with an abstract method turnOn() and a concrete method turnOff(). 
Then, create two subclasses Fan and Light that implement the turnOn() method in their own way.

Steps:

Define the abstract class Appliance with an abstract turnOn() method and a concrete turnOff() method.
Create the Fan subclass that implements the turnOn() method (e.g., print "Fan is spinning").
Create the Light subclass that implements the turnOn() method (e.g., print "Light is turned on").
In the main method, create instances of Fan and Light and call both turnOn() and turnOff() methods.
 */
import java.util.*;

abstract class Appliance{
    abstract void turnOn();
    void turnOff(){
        System.out.println("Turn off everything!");
    }
}
class Fan extends Appliance{
    @Override void turnOn(){
System.out.println("Fan is spinning");
}
@Override void turnOff(){
    System.out.println("Turn off Fan!");
}
}
class Light extends Appliance{
    @Override void turnOn(){
        System.out.println("Light is turned on");
        }
        @Override void turnOff(){
            System.out.println("Turn off Light!");
        }
}
public class Prob25 {
    public static void main(String[] args) {
        Fan f= new Fan();
    Light l= new Light();
    f.turnOn();
    l.turnOn();
    f.turnOff();
    l.turnOff();
    }
}
