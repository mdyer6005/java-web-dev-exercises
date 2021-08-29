package exercises;
import java.util.Scanner;


public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas were consumed?");
        Double gallonsOfGasUsed = input.nextDouble();
        System.out.println("That equates to " + (milesDriven/gallonsOfGasUsed) + " miles-per-gallon.");
    }
}
