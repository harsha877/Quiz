package com.quiz.quiz.service;

import com.quiz.quiz.entity.User;
import com.quiz.quiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Objects;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;

    public String loginService(String username, String password, HttpSession httpSession){
        User user=userRepository.findByUsername(username);
        if (!Objects.isNull(user)){
            httpSession.setAttribute("name",user.getName());
            httpSession.setAttribute("userObject",user);
            return user.getPassword().equalsIgnoreCase(password)?"userHome":"login";}
        else{
            httpSession.invalidate();
            return "login";
        }
    }

    public String homeService(){
        return "index";
    }
    public String signService(String name, String username, String password, HttpSession httpSession){
        //Class<? extends Optional> id = userRepository.findAll().stream().sorted((user, a) -> user.getId()>=a.getId()?-1:1).findFirst();
        //System.out.println(id);
        User user = new User(name,username,password,null,null);
        userRepository.save(user);
        httpSession.setAttribute("name",user.getName());
        httpSession.setAttribute("userObject",user);
        return "userHome";
    }
}
