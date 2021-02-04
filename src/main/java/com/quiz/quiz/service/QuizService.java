package com.quiz.quiz.service;

import com.quiz.quiz.beans.Quiz;
import com.quiz.quiz.beans.Results;
import com.quiz.quiz.entity.Question;
import com.quiz.quiz.entity.User;
import com.quiz.quiz.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Value("${totalNumberOfQuestions}")
    private int totalNumberOfQuestions;
    @Autowired
    QuestionsRepository questionsRepository;

    public String startQuiz(HttpSession httpSession){
        Quiz quiz= new Quiz();
        quiz.setUser((User) httpSession.getAttribute("userObject"));
        quiz.setNext(0);
        quiz.setPrevious(0);
        quiz.setTotal(totalNumberOfQuestions);
        quiz.setQuestion(questionsRepository.findAll()
                .stream()
                .limit(totalNumberOfQuestions)
                .collect(Collectors.toList()));
        quiz.setUserAnswers(new ArrayList<String>(totalNumberOfQuestions));
        setNextQuestion(quiz,httpSession);
        quiz.setResults(new Results(totalNumberOfQuestions,0,0,0));
        httpSession.setAttribute("quizobject",quiz);
        return null;
    }
    public void setNextQuestion(Quiz quiz,HttpSession httpSession){
        if(quiz.getNext() < quiz.getTotal()){
        quiz.setCrrentQuestion(quiz.getQuestion().get(quiz.getNext()));
        setQuestion(httpSession,quiz);
        }else{
            calculateResult(quiz);
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

    public void setQuestion(HttpSession httpSession, Quiz quiz){
        httpSession.setAttribute("currentQuestion",quiz.getCrrentQuestion().getQuestion());
        httpSession.setAttribute("id",quiz.getNext());
        httpSession.setAttribute("o1",quiz.getCrrentQuestion().getO1());
        httpSession.setAttribute("o2",quiz.getCrrentQuestion().getO2());
        httpSession.setAttribute("o3",quiz.getCrrentQuestion().getO3());
        httpSession.setAttribute("o4",quiz.getCrrentQuestion().getO4());
        httpSession.setAttribute("focus",getFocusID(quiz));
    }

    public String getFocusID(Quiz quiz){

        return (quiz.getUserAnswers().size()<=quiz.getNext()?
                "0":quiz.getUserAnswers().get(quiz.getNext()));
    }

    public String nextQuestion(HttpSession httpSession,int id,String option,String next){
        Quiz quiz=(Quiz) httpSession.getAttribute("quizobject");
        setUserResponse(quiz,id,option);
        quiz.setNext(next.equalsIgnoreCase("next")?id+1:id-1);
        setNextQuestion(quiz,httpSession);
        httpSession.setAttribute("quizobject",quiz);
        return quiz.getNext()==quiz.getTotal()?"result":"start";

    }

    public void calculateResult(Quiz quiz){
        Results results=quiz.getResults();
        quiz.setResults(results);
        int unAnswred=0,correct=0,wrong=0;
        for(int i=0; i<quiz.getTotal(); i++) {
            if(quiz.getUserAnswers().get(i).equalsIgnoreCase("0"))
                unAnswred++;
            else if (quiz.getQuestion().get(i).getCorrect().equalsIgnoreCase(quiz.getUserAnswers().get(i)))
                correct++;
            else
                wrong++;
        }
        results.setUnAnswred(unAnswred);
        results.setCorrect(correct);
        results.setWrong(wrong);
        quiz.setResults(results);

    }

    public void setUserResponse(Quiz quiz,int id,String option){
        if(id>=quiz.getUserAnswers().size())
            quiz.getUserAnswers().add(id,option);
        else
            quiz.getUserAnswers().set(id,option);
    }

}
