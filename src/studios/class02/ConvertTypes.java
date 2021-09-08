package studios.class02;
import static reuse.ManipulateStrings.removeNonAlphabetic;

public class ConvertTypes {
    public static char[] convertToCharactersMinusPunctuation(String stringToConvert) {
        char [] characterArray = stringToConvert.toCharArray();
        return characterArray;
    }

    public static char[] getLetterArray(String stringToConvert) {
        char [] letterArray = removeNonAlphabetic(stringToConvert).toCharArray();
        return letterArray;
    }
}
