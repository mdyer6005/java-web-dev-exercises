package reuse;
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
        return null;
    }

}
