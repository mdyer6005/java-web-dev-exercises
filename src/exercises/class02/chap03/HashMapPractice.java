package exercises.class02.chap03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String > students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentName;

        System.out.println("Enter student's name (or ENTER to finish):");

        // Get student names and ID
        do {
            System.out.print("Student name: ");
            newStudentName = input.nextLine();

            if (!newStudentName.equals("")) {
                System.out.print("Student ID: ");
                Integer newStudentID = input.nextInt();
                students.put(newStudentID, newStudentName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Id: " + student.getKey() + "\t Name: " + student.getValue());
        }

        System.out.println("Student count: " + students.size());
    }
}
