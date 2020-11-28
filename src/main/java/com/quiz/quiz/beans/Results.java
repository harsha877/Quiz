package com.quiz.quiz.beans;

import javax.persistence.Entity;

public class Results {

    private int total;
    private int correct;
    private int wrong;
    private int unAnswred;

    public Results(int total, int correct, int wrong, int unAnswred) {
        this.total = total;
        this.correct = correct;
        this.wrong = wrong;
        this.unAnswred = unAnswred;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnAnswred() {
        return unAnswred;
    }

    public void setUnAnswred(int unAnswred) {
        this.unAnswred = unAnswred;
    }
}
