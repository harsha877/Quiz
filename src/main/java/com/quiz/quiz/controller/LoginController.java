package com.quiz.quiz.controller;

import com.quiz.quiz.repository.UserRepository;
import com.quiz.quiz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@RequestMapping("/home")
@Controller
public class LoginController {

    @Autowired
    public LoginService loginService;

    @GetMapping
    public String home(HttpSession httpSession){
        return  Objects.isNull(httpSession.getAttribute("name"))?"login":"userHome";
    }

    @GetMapping("/login")
    public String login(HttpSession httpSession){
        System.out.println(httpSession.getAttribute("name"));
        return Objects.isNull(httpSession.getAttribute("name"))?"login":"userHome";
    }
    @PostMapping("/login")
    public String loginPost(@RequestParam("username") String username,@RequestParam("password") String password
            ,HttpSession httpSession){
        System.out.println(httpSession.getId());
        return loginService.loginService(username,password,httpSession);
    }

    @GetMapping("/sign")
    public String sign(HttpSession httpSession){
        return Objects.isNull(httpSession.getAttribute("name"))?"sign_up":"userHome";
    }
    @PostMapping("/sign")
    public String sign(@RequestParam("name") String name,@RequestParam("username") String username
            ,@RequestParam("password") String password, HttpSession httpSession){
        return loginService.signService(name,username,password,httpSession);
    }

    @GetMapping("/signout")
    public String signout(HttpSession httpSession){
        httpSession.invalidate();
        return "index";
    }

    @GetMapping("/nav")
    public String navbar(HttpSession httpSession){
        httpSession.setAttribute("value","i am from session");
        return "navbar";
    }

}
