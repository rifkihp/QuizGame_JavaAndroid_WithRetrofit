package com.example.quizgame;

import com.google.gson.annotations.SerializedName;

public class QuestionsList {

    @SerializedName("pertanyaan")
    private String question;

    @SerializedName("pilihan_1")
    private String option1;

    @SerializedName("pilihan_2")
    private String option2;

    @SerializedName("pilihan_3")
    private String option3;

    @SerializedName("pilihan_4")
    private String option4;

    @SerializedName("jawaban")
    private String answer;

    private String userSelectedAnswer;

    public QuestionsList(String question, String option1, String option2, String option3, String option4, String answer, String userSelectedAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }
}
