package com.quiz.quiz.service;

import com.quiz.quiz.beans.Quiz;
import com.quiz.quiz.beans.Results;
import com.quiz.quiz.entity.User;
import com.quiz.quiz.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class QuizService {

    @Autowired
    QuestionsRepository questionsRepository;

    public String startQuiz(HttpSession httpSession){
        Quiz quiz= new Quiz();
        quiz.setUser((User) httpSession.getAttribute("userObject"));
        quiz.setNext(0);
        quiz.setPrevious(0);
        quiz.setTotal(10);
        quiz.setQuestion(questionsRepository.findAll());
        setNextQuestion(quiz,httpSession);
        quiz.setResults(new Results(10,0,0,0));
        httpSession.setAttribute("quizobject",quiz);
        return null;
    }
    public static void setNextQuestion(Quiz quiz,HttpSession httpSession){
        if(quiz.getNext() < quiz.getTotal()){
        quiz.setCrrentQuestion(quiz.getQuestion().get(quiz.getNext()));
        httpSession.setAttribute("currentQuestion",quiz.getCrrentQuestion().getQuestion());
        httpSession.setAttribute("id",quiz.getNext());
        httpSession.setAttribute("o1",quiz.getCrrentQuestion().getO1());
        httpSession.setAttribute("o2",quiz.getCrrentQuestion().getO2());
        httpSession.setAttribute("o3",quiz.getCrrentQuestion().getO3());
        httpSession.setAttribute("o4",quiz.getCrrentQuestion().getO4());
        }else{
            httpSession.removeAttribute("currentQuestion");
            httpSession.removeAttribute("id");
            httpSession.removeAttribute("o1");
            httpSession.removeAttribute("o2");
            httpSession.removeAttribute("o3");
            httpSession.removeAttribute("o4");
            httpSession.setAttribute("total",quiz.getResults().getTotal());
            httpSession.setAttribute("unans",quiz.getResults().getUnAnswred());
            httpSession.setAttribute("wrong",quiz.getResults().getWrong());
            httpSession.setAttribute("correct",quiz.getResults().getCorrect());
        }
    }
    public String nextQuestion(HttpSession httpSession,int id,String option){
        Quiz quiz=(Quiz) httpSession.getAttribute("quizobject");
        calculateResult(quiz,id,option);
        quiz.setNext(id+1);
        setNextQuestion(quiz,httpSession);
        httpSession.setAttribute("quizobject",quiz);
        return quiz.getTotal() == id+1?"result":"start";

    }

    public static void calculateResult(Quiz quiz,int id,String option){
        Results results=quiz.getResults();
        if (option.equalsIgnoreCase("0")) {
            results.setUnAnswred(results.getUnAnswred() + 1);
        }else if(quiz.getCrrentQuestion().getCorrect().equalsIgnoreCase(option)){
            results.setCorrect(results.getCorrect() + 1);
        } else {
            results.setWrong(results.getWrong() + 1);
        }
        quiz.setResults(results);
    }

}
