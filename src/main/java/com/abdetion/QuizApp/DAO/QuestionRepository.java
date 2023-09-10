package com.abdetion.QuizApp.DAO;

import com.abdetion.QuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
