package com.example.kvizko.repository;

import com.example.kvizko.models.EmbeddedClasses.SelectedchoiceIdClass;
import com.example.kvizko.models.Selectedchoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedchoiceRepository extends JpaRepository<Selectedchoice, SelectedchoiceIdClass> {

}
