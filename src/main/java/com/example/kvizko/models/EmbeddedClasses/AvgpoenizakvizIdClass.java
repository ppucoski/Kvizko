package com.example.kvizko.models.EmbeddedClasses;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AvgpoenizakvizIdClass implements Serializable {

    private String username;

    private String quizname;

}
