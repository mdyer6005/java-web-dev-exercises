package studios.class06.question;

import reuse.GetInput;

import java.util.ArrayList;

public abstract class SelectMultiple extends Question {
    private ArrayList<Integer> selections = new ArrayList<>();

    public ArrayList<Integer> getSelections() {
        return selections;
    }

    public void setSelections(ArrayList<Integer> selections) {
        this.selections = selections;
    }

    public SelectMultiple(String questionText, ArrayList<Choice> choiceList, double possiblePoints) {
        super(questionText, choiceList, possiblePoints);
    }

    public void collectSelections() {
        int selectionNumber = -1;
        String prompt = "\nEnter the number corresponding to your selection,\nor enter 0 to " +
                "end selections for this question.\nYou have up to %d selections remaining.\n\nSelection: ";
        do {
            selectionNumber = GetInput.getInt(String.format(prompt, this.getChoices().size() - this.selections.size()));
            if (isValidSelection(selectionNumber)) {
                if (this.getSelections().contains(selectionNumber)){
                    System.out.println(String.format("\nYou have already selected %d", selectionNumber));
                } else {
                    this.selections.add(selectionNumber);
                }
            } else if (selectionNumber == 0) {
                System.out.println("\nFinalizing selections.");
                return;
            } else {
                System.out.println(String.format("\n%d is not a valid selection.  Choose from %d " +
                        "through %d", selectionNumber, 1, this.getChoices().size()));
            }
        } while (!isValidSelection(selectionNumber) || this.selections.size() < this.getChoices().size());

        System.out.println("\nFinalizing selections.");
    }
    public void applySelections() {
        if (this.selections == null) {
            return;
        }
        if (this.selections.size() >= 1) {
            for (Integer selection : this.selections) {
                int index = convertSelectionToIndex(selection);
                this.getChoices().get(index).setSelected(true);
            }
        }
    }

    public void scoreSelections() {
        double pointsPerChoice = this.getPossiblePoints() / this.getChoices().size();
        double pointsScored = 0;
        for (Choice checkChoice : this.getChoices()) {
            if (checkChoice.wasAnsweredCorrectly()) {
                pointsScored += pointsPerChoice;
            }
        }
        this.setScoredPoints(pointsScored);
    }

    public void displayWithScore() {
        double pointsPerChoice = this.getPossiblePoints() / this.getChoices().size();
        String underline = new String(new char[this.getQuestionText().length()]).replace("\0", "-");
        System.out.println("\n" + this.getQuestionText());
        System.out.println(underline);
        for (Choice thisChoice : this.getChoices()) {
            double pointsScored = 0;
            if (thisChoice.wasAnsweredCorrectly()) {
                pointsScored = pointsPerChoice;
            }
            System.out.println(String.format("%s\nShould be selected?: %s\t\tYou selected it?: " +
                            "%s\t\tYou're correct?: %s\t\tPoints: %.2f", thisChoice.getChoiceText(), boolToYN(thisChoice.isCorrect()),
                    boolToYN(thisChoice.isSelected()), boolToYN(thisChoice.wasAnsweredCorrectly()), pointsScored));
        }
        System.out.println(String.format("Scored %f out of %f points for this question\n", this.getScoredPoints(), this.getPossiblePoints()));
    }
}
