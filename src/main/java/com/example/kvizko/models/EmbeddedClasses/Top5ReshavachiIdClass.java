package com.example.kvizko.models.EmbeddedClasses;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class Top5ReshavachiIdClass implements Serializable {

    private String quizname;

    private String username;
}
