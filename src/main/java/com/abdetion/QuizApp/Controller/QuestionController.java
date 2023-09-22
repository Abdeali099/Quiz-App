package com.abdetion.QuizApp.Controller;

import com.abdetion.QuizApp.Entity.Question;
import com.abdetion.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

   /* without response entity
    @GetMapping("/allQuestion")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
*/

/*   with response Entity
    @GetMapping("/allQuestion")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
    }
 */
    @GetMapping("/allQuestion")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable int id){
        return questionService.deleteQuestion(id);
    }

    @PatchMapping("/update")
    public String updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }

}
