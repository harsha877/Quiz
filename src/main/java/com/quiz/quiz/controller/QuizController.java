package com.quiz.quiz.controller;

import com.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.PublicKey;
import java.util.Objects;

@RequestMapping("/quiz")
@Controller
public class QuizController {

    @Autowired
    QuizService quizService;

    public boolean isSessionActive(HttpSession httpSession){
        return !Objects.isNull(httpSession.getAttribute("name"));
    }

    @GetMapping
    public String quiz(HttpSession httpSession){
        if (isSessionActive(httpSession)){
            quizService.startQuiz(httpSession);
            return "start";
        }else{
            return "index";
        }
    }

    @PostMapping("/next")
    public String nextQuestion(@RequestParam("question") int id,@RequestParam("option") String  option, HttpSession httpSession){
        if (isSessionActive(httpSession)){
            return quizService.nextQuestion(httpSession,id,option);
        }else{
            return "index";
        }
    }
    @GetMapping("/next")
    public String nextQuestionget(  HttpSession httpSession){
        if (isSessionActive(httpSession)){
            return "login";
        }else{
            return "index";
        }
    }
}
