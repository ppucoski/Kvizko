package com.example.kvizko.models.views;

import com.example.kvizko.models.EmbeddedClasses.LeaderboardIdClass;
import com.example.kvizko.models.EmbeddedClasses.Top5ReshavachiIdClass;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "leaderboard")
@Data
public class Leaderboard {

    @EmbeddedId
    private LeaderboardIdClass leaderboardIdClass;

    @Column(name = "total_points")
    private int total_points;


    public String getUsername() {
        return leaderboardIdClass.getUsername();
    }

    public int getPoints() {
        return total_points;
    }

    public void setPoints(int points) {
        this.total_points = points;
    }
}



