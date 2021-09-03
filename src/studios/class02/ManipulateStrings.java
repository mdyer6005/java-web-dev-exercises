package studios.class02;

public class ManipulateStrings {
    public static String removeNonAlphabetic(String stringToManipulate) {
        return stringToManipulate.replaceAll("[^a-zA-Z]", "");
    }

    public static String removeSpecialCharacters(String stringToManipulate) {
        return stringToManipulate.replaceAll("[^a-zA-Z0-9]", "");
    }
}
