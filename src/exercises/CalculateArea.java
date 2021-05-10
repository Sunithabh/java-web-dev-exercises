package exercises;
import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the rectangle length:");
        double length = input.nextDouble();
        System.out.println("whats the rectangle width:");
        double width = input.nextDouble();

        double rectangleArea = length * width;
        System.out.println("The Area of the Rectangle is: " + rectangleArea + " sq.m");
    }
}
