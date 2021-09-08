package studios.class02;
import java.util.HashMap;
import java.util.Map;

import static studios.class02.ConvertTypes.getLetterArray;
import static studios.class02.Count.createCharacterCountHash;
import static reuse.GetInput.getString;

public class Class02Studio {
    public static void main(String[] args) {
        String stringOfCharacters = getString("Enter a string to count characters from " +
                "or press ENTER to use default string: ");
        if (stringOfCharacters.equals("")) {
            stringOfCharacters = "If the product of two terms is zero then common sense says at least one of the " +
                    "two terms has to be zero to start with. So if you move all the terms over to one side, you " +
                    "can put the quadratics into a form that can be factored allowing that side of the equation to " +
                    "equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        }
        char [] letterArray = getLetterArray(stringOfCharacters.toLowerCase());
        //System.out.println(letterArray);
        HashMap<Character, Integer> characterCounts = createCharacterCountHash(letterArray);

        for (Map.Entry<Character, Integer> letter : characterCounts.entrySet()) {
            System.out.println("letter: " + letter.getKey() + "\tcount: " + letter.getValue());
        }
    }
}
