package com.example.kvizko.repository;

import com.example.kvizko.models.ResultTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<ResultTable, Long> {
}
