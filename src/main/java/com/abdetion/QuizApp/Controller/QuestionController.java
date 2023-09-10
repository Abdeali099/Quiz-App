package com.abdetion.QuizApp.Controller;

import com.abdetion.QuizApp.Entity.Question;
import com.abdetion.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestion")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

}
