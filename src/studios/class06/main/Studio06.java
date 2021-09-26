package studios.class06.main;

import studios.class06.question.*;

import java.util.ArrayList;

public class Studio06 {
    public static void main(String[] args) {
        Quiz qz1 = new Quiz();

        Choice cb1a = new Choice("A", true);
        Choice cb1b = new Choice("B", true);
        Choice cb1c = new Choice("C", false);
        Choice cb1d = new Choice("D", true);
        Choice cb1e = new Choice("E", false);
        ArrayList<Choice> checkboxChoices = new ArrayList<>();
        checkboxChoices.add(cb1a);
        checkboxChoices.add(cb1b);
        checkboxChoices.add(cb1c);
        checkboxChoices.add(cb1d);
        checkboxChoices.add(cb1e);

        Choice mc1a = new Choice("A", false);
        Choice mc1b = new Choice("B", false);
        Choice mc1c = new Choice("C", false);
        Choice mc1d = new Choice("D", true);
        Choice mc1e = new Choice("E", false);
        ArrayList<Choice> mcChoices = new ArrayList<>();
        mcChoices.add(mc1a);
        mcChoices.add(mc1b);
        mcChoices.add(mc1c);
        mcChoices.add(mc1d);
        mcChoices.add(mc1e);

        Checkbox cb1 = new Checkbox("Which letters do you like?", checkboxChoices, 6);

        MultipleChoice mc1 = new MultipleChoice("Which letter is the best one?", checkboxChoices, 6);

        TrueFalse tf1 = new TrueFalse("Is this t or f?", true, 4);


        qz1.addQuestions((Question) mc1, (Question) cb1, (Question) tf1);
        qz1.askQuestions();
    }
}
