package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        Double length = input.nextDouble();
        System.out.println("Please enter the width: ");
        Double width = input.nextDouble();
        System.out.println("The rectangle's area is " + (length * width));
    }
}
