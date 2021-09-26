package studios.class06.question;

import java.util.ArrayList;


public class TrueFalse extends MultipleChoice{

    private Choice choiceTrue = new Choice("True", false);
    private Choice choiceFalse = new Choice("False", false);

    public TrueFalse(String questionText, Boolean correctAnswerIs, double possiblePoints) {
        super(questionText, new ArrayList<Choice>(), possiblePoints);
        if (correctAnswerIs) {
            choiceTrue.setCorrect(true);
        } else {
            choiceFalse.setCorrect(true);
        }
        this.addChoices(choiceTrue, choiceFalse);
    }

    @Override
    public void addChoices(Choice... newChoices) {
        int  maxChoicesForTrueFalse = 2;
        if (this.getChoices().size() + newChoices.length <= maxChoicesForTrueFalse) {
            super.addChoices(newChoices);
        } else {
            System.out.println("cannot add more than two choices to True/False");
        }
    }

}
