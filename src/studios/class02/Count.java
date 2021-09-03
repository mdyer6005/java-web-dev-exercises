package studios.class02;
import java.util.HashMap;

public class Count {
    public static HashMap<Character, Integer> createCharacterCountHash(char[] charArray) {
        HashMap<Character, Integer> charHash = new HashMap<>();
        for (char letter: charArray) {
            if (charHash.containsKey(letter)) {
                charHash.put(letter, (charHash.get(letter) + 1));
            } else {
                charHash.put(letter, 1);
            }
        }
        return charHash;
    }

}
