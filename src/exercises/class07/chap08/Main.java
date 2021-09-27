package exercises.class07.chap08;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator flavorComparator = new FlavorComparator();

        flavors.sort(flavorComparator);


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator coneComparator = new ConeComparator();

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Before");
        for (Cone cone : cones) {
            System.out.println(cone.printCost());
        }

        cones.sort(coneComparator);

        System.out.println("\nAfter");
        for (Cone cone : cones) {
            System.out.println(cone.printCost());
        }

    }

}
