package com.abdetion.QuizApp.Service;

import com.abdetion.QuizApp.DAO.QuestionRepository;
import com.abdetion.QuizApp.DAO.QuizRepository;
import com.abdetion.QuizApp.Entity.Question;
import com.abdetion.QuizApp.Entity.QuestionWrapper;
import com.abdetion.QuizApp.Entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
        Optional<Quiz> quiz=quizRepository.findById(id);

        List<Question> questionsOfQuiz=quiz.get().getQuestions();

        List<QuestionWrapper> questionsForUser=new ArrayList<>();

        for(Question q:questionsOfQuiz){

            QuestionWrapper questionWrapper=new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOptionOne(),q.getOptionTwo(),q.getOptionThree(),q.getOptionFour());

            questionsForUser.add(questionWrapper);

        }


        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);

    }
}
