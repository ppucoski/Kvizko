package com.example.kvizko.repository;

import com.example.kvizko.models.views.Korisnicirangiranisporedmedali;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KvizovirangiranisporedtochniprashanjaRepository extends JpaRepository<Korisnicirangiranisporedmedali, String> {
}
