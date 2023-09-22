package com.abdetion.QuizApp.Service;

import com.abdetion.QuizApp.DAO.QuestionRepository;
import com.abdetion.QuizApp.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<List<Question>> getAllQuestions() {

        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Error in service of getting all questions : " + e);
        }

//        List<String> result=new ArrayList<>();
//        result.add("{Error : data nor fetched}");

//        return new ResponseEntity<>(result, HttpStatus.OK);

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);


    }

     public List<Question> getQuestionsByCategory(String Category) {
        return questionRepository.findByCategory(Category);
    }


    public String addQuestion(Question question) {
        questionRepository.save(question);
        return "Question Added Successfully...";
    }

    public String deleteQuestion(int id) {
        questionRepository.deleteById(id);
        return "Question Deleted Successfully...";
    }

    public String updateQuestion(Question question) {
        questionRepository.save(question);
        return "Question Updated Successfully...";
    }
}

