package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity(name = "quiz")

public class QuizEntity {
    @Id
    private String id;
    private Local date;
    private String grade;
    private int mark;

    @ManyToMany(mappedBy = "quizzes")
    private List<WordEntity> word = new ArrayList<>();
}
