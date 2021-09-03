package studios.class02;
import java.util.Scanner;

public class GetInput {
    static Scanner input = new Scanner(System.in);

    public static String promptForString(String promptMessage) {
        System.out.println(promptMessage);
        String userAnswer = input.nextLine();
        return userAnswer;
    }

}
