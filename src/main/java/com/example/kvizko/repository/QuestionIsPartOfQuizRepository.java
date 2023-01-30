package com.example.kvizko.repository;

import com.example.kvizko.models.EmbeddedClasses.QuestionIsPartOfQuizIdClass;
import com.example.kvizko.models.QuestionIsPartOfQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionIsPartOfQuizRepository extends JpaRepository<QuestionIsPartOfQuiz, QuestionIsPartOfQuizIdClass> {

    List<QuestionIsPartOfQuiz> findAllByQuestionIsPartOfQuizIdClassQuizid(Long quizid);

}
