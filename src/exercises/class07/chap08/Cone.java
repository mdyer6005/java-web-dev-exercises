package exercises.class07.chap08;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Cone extends Ingredient {

    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    public String printCost() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return String.format("%s:\t\t%s",this.getName(),currency.format(this.getCost()));
    }


}
