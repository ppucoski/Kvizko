package com.example.kvizko.models.EmbeddedClasses;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class QuestionIsPartOfQuizIdClass implements Serializable {

    private long questionid;

    private long quizid;

    public QuestionIsPartOfQuizIdClass(long questionid, long quizid) {
        this.questionid = questionid;
        this.quizid = quizid;
    }

    public QuestionIsPartOfQuizIdClass() {

    }
}
