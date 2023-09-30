package com.abdetion.QuizApp.Service;

import com.abdetion.QuizApp.DAO.QuestionRepository;
import com.abdetion.QuizApp.DAO.QuizRepository;
import com.abdetion.QuizApp.Entity.Question;
import com.abdetion.QuizApp.Entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;
    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        /* Get Questions */
        List<Question> questions=questionRepository.findRandomQuestionsByCategory(category,numQ);

        /* Create Quiz */
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

//        Save Quiz
        quizRepository.save(quiz);

        return new ResponseEntity<>("Successfully Created!", HttpStatus.CREATED);
    }
}
