package com.example.kvizko.repository;

import com.example.kvizko.models.views.Top5Reshavachi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Top5ReshavachiRepository extends JpaRepository<Top5Reshavachi, String> {
}
