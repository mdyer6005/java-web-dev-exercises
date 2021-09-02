package exercises.class01.chap02;
import java.util.Scanner;

public class SearchRemoveAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FIRST_SENTENCE = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("What term would you like to search for? ");
        String userSearchTerm = input.nextLine();
        boolean wordWasFound = FIRST_SENTENCE.toLowerCase().contains(userSearchTerm.toLowerCase());
        if (wordWasFound) {
            int foundAtIndex = FIRST_SENTENCE.toLowerCase().indexOf(userSearchTerm.toLowerCase());
            int searchTermLength = userSearchTerm.length();
            System.out.println("Your term, " + userSearchTerm + " is " + searchTermLength + " characters long, and was found at index "  + foundAtIndex + ".");
            System.out.println("Here is the sentence with your term removed:");
            String newSentence = FIRST_SENTENCE.substring(0, foundAtIndex) + FIRST_SENTENCE.substring(foundAtIndex + searchTermLength);
            System.out.println(newSentence);
        } else {
            System.out.println("Your term, " + userSearchTerm + " is " + userSearchTerm.length() + " characters long, and was not found.");
        }

    }
}
