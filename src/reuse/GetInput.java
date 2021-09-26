package reuse;
import java.text.ParseException;
import java.util.Scanner;

public class GetInput {
    static Scanner input = new Scanner(System.in);

    public static String getString(String promptMessage) {
        System.out.print(promptMessage);
        return input.nextLine();
    }

    public static Double getDouble(String promptMessage) {
        String userAnswer = getString(promptMessage);
        Double convertedToDouble;
        try {
            convertedToDouble = Double.parseDouble(userAnswer);
            return convertedToDouble;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Double.");
        }
        throw new NumberFormatException(String.format("Could not convert %s to Double", userAnswer));
    }

    public static Integer getInteger(String promptMessage) {
        String userAnswer = getString(promptMessage);
        Integer convertedToInteger;
        try {
            convertedToInteger = Integer.parseInt(userAnswer);
            return convertedToInteger;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        throw new NumberFormatException(String.format("Could not convert %s to Integer", userAnswer));
    }

    public static int getInt(String promptMessage) {
        String userAnswer = getString(promptMessage);
        int convertedToInteger;
        try {
            convertedToInteger = Integer.parseInt(userAnswer);
            return convertedToInteger;
        } catch (NumberFormatException e) {
            System.out.println(String.format("Could not convert %s to int", userAnswer));
        }
        return -1;
        //throw new NumberFormatException(String.format("Could not convert %s to int", userAnswer));
    }

}
