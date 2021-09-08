package studios.class01;

public class CheckInput {
    public static boolean isValidDouble(String inputString) {
        double doubleValue;

        if (inputString == null || inputString.equals("")) {
            return false;
        }
        try {
            doubleValue = Double.parseDouble(inputString);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Double.");
        }
        return false;
    }
}
