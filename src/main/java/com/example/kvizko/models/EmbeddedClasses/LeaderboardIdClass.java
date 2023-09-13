package com.example.kvizko.models.EmbeddedClasses;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
@Embeddable
@Data

public class LeaderboardIdClass implements Serializable {
    private String username;
}
