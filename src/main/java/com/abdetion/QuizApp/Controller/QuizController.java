package com.abdetion.QuizApp.Controller;

import com.abdetion.QuizApp.Entity.QuestionWrapper;
import com.abdetion.QuizApp.Entity.UserResponse;
import com.abdetion.QuizApp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable int id){
        return quizService.getQuizQuestion(id);
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> getQuizResult(@PathVariable int id, @RequestBody List<UserResponse> userResponses){
        return quizService.calculateResult(id,userResponses);
    }

}
