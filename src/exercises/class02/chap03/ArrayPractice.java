package exercises.class02.chap03;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                System.out.println(numberArray[i]);
            }
        }
        String longString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] wordArray = longString.split(" ");
        System.out.println(Arrays.toString(wordArray));
        //System.out.println(longString);
        String[] sentenceArray = longString.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
