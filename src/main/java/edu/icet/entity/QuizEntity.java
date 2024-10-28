package edu.icet.entity;

import edu.icet.dto.QuizWord;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity(name = "quiz")

public class QuizEntity {
    @Id
    private long quiz_id;
    private LocalDate date;
    private String grade;
    private int mark;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<QuizWordEntity> quizWords = new ArrayList<>();
}
