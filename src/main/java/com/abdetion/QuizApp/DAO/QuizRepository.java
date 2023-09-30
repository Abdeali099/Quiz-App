package com.abdetion.QuizApp.DAO;


import com.abdetion.QuizApp.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
