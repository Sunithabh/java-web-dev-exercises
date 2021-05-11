package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        double radius = 0;
        boolean isNumber = false;
       System.out.println("Radius of the circle:");
        do {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("Enter a positive number");
                } else {
                    isNumber = true;
                }
            } else {
                System.out.println("Enter a valid number");
                input.next();
            }
        } while (!(isNumber));
        // double area = 3.14 * radius * radius;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area);

   }
}

