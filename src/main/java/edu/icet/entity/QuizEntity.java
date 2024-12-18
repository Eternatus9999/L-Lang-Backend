package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity
@Table(name = "quiz")

public class QuizEntity {
    @Id
    private String quiz_id;
    private String player;
    private LocalDate date;
    private String grade;
    private int mark;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "quiz_id",referencedColumnName = "quiz_id")
    private List<QuizWordEntity> words = new ArrayList<>();
}
