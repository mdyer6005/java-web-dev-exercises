package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double area = getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
