package studios.class06.question;
import java.util.ArrayList;

public abstract class Question {
    private String questionText;
    private ArrayList<Choice> choices;
    private double possiblePoints;
    private double scoredPoints;


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Choice> choices) {
        this.choices = choices;
    }

    public double getPossiblePoints() {
        return possiblePoints;
    }

    public void setPossiblePoints(double possiblePoints) {
        this.possiblePoints = possiblePoints;
    }

    public double getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(double scoredPoints) {
        this.scoredPoints = scoredPoints;
    }



    public Question(String aQuestionText, ArrayList<Choice> aChoices, double aPossiblePoints) {
        this.questionText = aQuestionText;
        this.choices = aChoices;
        this.possiblePoints = aPossiblePoints;
    }

    public void addChoices(Choice... newChoices) {
        for (Choice newChoice : newChoices) {
            this.choices.add(newChoice);
        }
    }

    public void askQuestion() {
        String underline = new String(new char[this.getQuestionText().length()]).replace("\0", "-");
        System.out.println("\n" + this.getQuestionText());
        System.out.println(underline);
        for (Choice thisChoice : this.choices) {
            System.out.println(this.choices.indexOf(thisChoice) + 1 + ".\t" + thisChoice.getChoiceText());
        }
        System.out.println(underline);
    }



    public abstract void collectSelections();

    public abstract void applySelections();

    public abstract void scoreSelections();

    public abstract void displayWithScore();

    public boolean isValidSelection(int selectionNumber) {
        int index = convertSelectionToIndex(selectionNumber);
        return isValidIndex(index);
    }

    public boolean isValidIndex(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < this.getChoices().size()) {
            return true;
        } else {
            return false;
        }
    }

    public int convertSelectionToIndex(int selectionNumber) {
        return selectionNumber - 1;
    }

    public int convertIndexToSelection(int indexNumber) {
        return indexNumber + 1;
    }


    String boolToYN(boolean boolToConvert) {
        if (boolToConvert) {
            return "Y";
        } else {
            return "N";
        }
    }

}
