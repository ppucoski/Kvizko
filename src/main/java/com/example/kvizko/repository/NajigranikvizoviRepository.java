package com.example.kvizko.repository;

import com.example.kvizko.models.views.Najigranikvizovi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NajigranikvizoviRepository extends JpaRepository<Najigranikvizovi, String> {
}
