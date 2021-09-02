package exercises.class01.chap02;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
