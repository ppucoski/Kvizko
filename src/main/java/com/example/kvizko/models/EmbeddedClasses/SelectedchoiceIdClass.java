package com.example.kvizko.models.EmbeddedClasses;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class SelectedchoiceIdClass implements Serializable {

    private long choiceid;

    private long selectedchoiceid;

    public SelectedchoiceIdClass(long choiceid, long attemptid) {
        this.choiceid = choiceid;
        selectedchoiceid = attemptid;
    }

    public SelectedchoiceIdClass() {}
}
