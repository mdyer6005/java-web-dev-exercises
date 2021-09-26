package studios.class06.question;
import reuse.GetInput;

import java.util.ArrayList;

public abstract class SelectOne extends Question {
    private int selection;


    public SelectOne(String questionText, ArrayList<Choice> choiceList, double possiblePoints) {
        super(questionText, choiceList, possiblePoints);
    }

    public void collectSelections() {
        int selectionNumber = -1;
        String prompt = "\nEnter the number corresponding to your selection.\n\nSelection: ";
        do {
            selectionNumber = GetInput.getInt(prompt);
            if (isValidSelection(selectionNumber)) {
                this.selection = selectionNumber;
            } else {
                System.out.println(String.format("\n%d is not a valid selection.  Choose from %d " +
                        "through %d", selectionNumber, 1, this.getChoices().size()));
            }
        } while (!isValidSelection(selectionNumber));
        System.out.println("\nFinalizing selection.");
    }

    public void applySelections() {
        this.getChoices().get(convertSelectionToIndex(this.selection)).setSelected(true);
    }

    public void scoreSelections() {
        if (this.getChoices().get(convertSelectionToIndex(this.selection)).wasAnsweredCorrectly()) {
            this.setScoredPoints(this.getPossiblePoints());
        } else {
            this.setScoredPoints(0);
        }
    }

    public void displayWithScore() {
        String underline = new String(new char[this.getQuestionText().length()]).replace("\0", "-");
        System.out.println("\n" + this.getQuestionText());
        System.out.println(underline);
        int correctSelection = this.correctIndexNumber() + 1;
        for (Choice thisChoice : this.getChoices()) {
            int selectionNumber = this.getChoices().indexOf(thisChoice) + 1;
            System.out.print(selectionNumber + ".\t" + thisChoice.getChoiceText());
            if (selectionNumber == correctSelection) {
                System.out.println("     <correct answer>");
            } else {
                System.out.println();
            }
        }
        System.out.print(String.format("\nYou selected %s", this.selection));
        if (this.selection == correctSelection) {
            System.out.println("\tCorrect!");
        } else {
            System.out.println("\tIncorrect.");
        }
        System.out.println(String.format("Scored %.2f out of %.2f points for this question\n", this.getScoredPoints(), this.getPossiblePoints()));
    }

    public int correctIndexNumber() {
        int correctIndex = -1;
        for (Choice checkChoice : this.getChoices()) {
            if (checkChoice.isCorrect()) {
                correctIndex = this.getChoices().indexOf(checkChoice);
            }
        }
        return correctIndex;
    }
}
