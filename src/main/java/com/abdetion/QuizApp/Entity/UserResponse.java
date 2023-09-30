package com.abdetion.QuizApp.Entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserResponse {

    private int questionId;
    private String submittedAnswer;

}
