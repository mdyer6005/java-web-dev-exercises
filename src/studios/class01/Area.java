package studios.class01;

import java.util.Scanner;

import static reuse.GetInput.getDouble;
import static studios.class01.Circle.getArea;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String userInput = input.nextLine();
        Double radius = getDouble("Enter a radius: ");

        while (radius == null) {
            radius = getDouble("Enter a radius: ");
        }
        Double area = getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
