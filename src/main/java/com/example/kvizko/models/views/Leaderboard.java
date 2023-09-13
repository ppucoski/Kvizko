package com.example.kvizko.models.views;

import com.example.kvizko.models.EmbeddedClasses.LeaderboardIdClass;
import com.example.kvizko.models.EmbeddedClasses.Top5ReshavachiIdClass;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity
@Table(name = "leaderboard")
@Data
public class Leaderboard {

    @EmbeddedId
    private LeaderboardIdClass leaderboardIdClass;

    private long points;


    public String getUsername() {
        return leaderboardIdClass.getUsername();
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }
}



