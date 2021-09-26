package studios.class06.question;

public class Choice {
    private String choiceText;
    private boolean correct;
    private boolean selected;

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String possibleAnswerText) {
        this.choiceText = possibleAnswerText;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Choice(String choiceText, boolean isCorrect) {
        this.setChoiceText(choiceText);
        this.setCorrect(isCorrect);
    }

    public boolean wasAnsweredCorrectly() {
        return this.isCorrect() == this.isSelected();
    }
}
