package com.quiz.quiz.beans;

import com.quiz.quiz.entity.Question;
import com.quiz.quiz.entity.User;

import java.security.PrivateKey;
import java.sql.ClientInfoStatus;
import java.util.List;

public class Quiz {

    private User user;
    private int next;
    private int previous;
    private int total;
    private List<Question> question;
    private List<String> userAnswers;
    private Question crrentQuestion;
    private Results results;

    public Quiz() {
    }

    public int getTotal() {
        return total;
    }

    public List<String> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<String> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getCrrentQuestion() {
        return crrentQuestion;
    }

    public void setCrrentQuestion(Question crrentQuestion) {
        this.crrentQuestion = crrentQuestion;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
