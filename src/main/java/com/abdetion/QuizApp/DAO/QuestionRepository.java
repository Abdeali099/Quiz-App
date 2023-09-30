package com.abdetion.QuizApp.DAO;

import com.abdetion.QuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String Category);

    @Query(value = "SELECT * FROM  question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
