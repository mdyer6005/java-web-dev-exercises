package studios.class06.main;

import studios.class06.question.Question;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionList = new ArrayList<Question>();
    private Double possiblePoints;
    private Double scoredPoints;

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public Double getPossiblePoints() {
        return possiblePoints;
    }

    public Double getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(Double scoredPoints) {
        this.scoredPoints = scoredPoints;
    }

    public void addQuestions(Question...newQuestions) {
        for (Question question : newQuestions) {
            questionList.add(question);
        }
    }

    public void askQuestions() {
        for (Question question : this.questionList) {
            question.askQuestion();
            question.collectSelections();
            question.applySelections();
            question.scoreSelections();
            question.displayWithScore();
        }
    }

}
