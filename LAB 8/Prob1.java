/*
Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/

class Vehicle {
    public void drive() {
        System.out.println("driving a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("repairing a car.");
    }
}

public class Prob1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.drive(); 
    }
}
