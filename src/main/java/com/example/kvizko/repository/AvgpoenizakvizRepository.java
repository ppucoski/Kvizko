package com.example.kvizko.repository;

import com.example.kvizko.models.views.Avgpoenizakviz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvgpoenizakvizRepository extends JpaRepository<Avgpoenizakviz, String> {
}
