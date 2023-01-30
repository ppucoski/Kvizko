package com.example.kvizko.repository;

import com.example.kvizko.models.Choice;
import com.example.kvizko.models.Question;
import com.example.kvizko.models.Selectionquestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long> {

    List<Choice> findAllBySelectionquestion_Questionid(Long questionId);
}
