package exercises;
import java.util.Scanner;

public class CalculateMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        double miles = input.nextDouble();
        System.out.println("How much gas has been consumed:");
        double gallon = input.nextDouble();

        double MpG = miles/gallon;
        System.out.println("Fuel efficiency is: " + MpG + " MPG");
    }
}
