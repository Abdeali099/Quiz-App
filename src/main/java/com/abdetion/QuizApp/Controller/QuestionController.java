package com.abdetion.QuizApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @GetMapping("/allQuestion")
    public String getAllQuestions(){
        return "Hello World";
    }

}
