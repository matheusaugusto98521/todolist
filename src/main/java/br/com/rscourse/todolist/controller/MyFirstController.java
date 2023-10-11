package br.com.rscourse.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-route")
//http:/localhost:8080/
public class MyFirstController {

    //método de funcionalidade de uma classe
    @GetMapping("/")
    public String firstMessage(){
        return "It worked very well";
    }
    
}
