package com.example.kvizko.repository;

import com.example.kvizko.models.views.Korisnicirangiranisporedmedali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KvizovirangiranisporedtochniprashanjaRepository extends JpaRepository<Korisnicirangiranisporedmedali, String> {
}
