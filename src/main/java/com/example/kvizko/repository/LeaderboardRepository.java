package com.example.kvizko.repository;

import com.example.kvizko.models.views.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepository  extends JpaRepository<Leaderboard, String> {
}
