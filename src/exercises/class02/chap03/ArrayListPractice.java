package exercises.class02.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(34);
        integerList.add(8);
        integerList.add(13);
        integerList.add(7);
        integerList.add(16);
        integerList.add(42);
        integerList.add(44);
        integerList.add(21);
        integerList.add(6);
        integerList.add(13);

        System.out.println(sumOfEvens(integerList));

        String longString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        ArrayList<String> wordList = convertPhraseToArrayList(longString);

        System.out.println("Find words with how many letters?");
        int userWordLength = input.nextInt();

        printWordsOfLength(wordList, userWordLength);
    }

    public static int sumOfEvens(ArrayList<Integer> integerList) {
        int sum  = 0;
        for ( Integer integerEntry : integerList) {
            if (integerEntry %2 == 0) {
                sum += integerEntry;
            }
        }
        return sum;
    }

    public static void printWordsOfLength(ArrayList<String> stringList, int wordLength) {
        for (String word : stringList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

    public static ArrayList<String> convertPhraseToArrayList(String stringToConvert) {
        String[] tempArray = stringToConvert.split("\\s+|,\\s*|\\.\\s*");
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList(tempArray));
        return newList;
    }

}
