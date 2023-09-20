package com.abdetion.QuizApp.DAO;

import com.abdetion.QuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String Category);
}