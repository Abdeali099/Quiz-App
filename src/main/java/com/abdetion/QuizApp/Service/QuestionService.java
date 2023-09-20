package com.abdetion.QuizApp.Service;

import com.abdetion.QuizApp.DAO.QuestionRepository;
import com.abdetion.QuizApp.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

     public List<Question> getQuestionsByCategory(String Category) {
        return questionRepository.findByCategory(Category);
    }


}

