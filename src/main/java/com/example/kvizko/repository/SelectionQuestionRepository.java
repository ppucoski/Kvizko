package com.example.kvizko.repository;

import com.example.kvizko.models.Selectionquestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectionQuestionRepository extends JpaRepository<Selectionquestion, Long> {
}
