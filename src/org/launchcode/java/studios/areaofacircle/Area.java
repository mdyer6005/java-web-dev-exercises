package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.CheckInput.isValidDouble;
import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String userInput = input.nextLine();
        while (!isValidDouble(userInput)) {
            System.out.println("Invalid radius. Enter a number: ");
            userInput = input.nextLine();
        }
        try {
            Double radius = Double.parseDouble(userInput);
            Double area = getArea(radius);
            System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Double.");
        }
    }
}
