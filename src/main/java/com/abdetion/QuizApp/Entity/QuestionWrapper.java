package com.abdetion.QuizApp.Entity;

import lombok.Data;

@Data
public class QuestionWrapper {

    private int id;
    private String questionTitle;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;

    public QuestionWrapper(int id, String questionTitle, String optionOne, String optionTwo, String optionThree, String optionFour) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
    }

    @Override
    public String toString() {
        return "QuestionWrapper{" +
                "id=" + id +
                ", questionTitle='" + questionTitle + '\'' +
                ", optionOne='" + optionOne + '\'' +
                ", optionTwo='" + optionTwo + '\'' +
                ", optionThree='" + optionThree + '\'' +
                ", optionFour='" + optionFour + '\'' +
                '}';
    }
}
