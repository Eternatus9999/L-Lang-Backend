package edu.icet.entity;

import edu.icet.dto.Quiz;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity(name = "word")

public class WordEntity {
    @Id
    private long id;
    private String name;
    private String pronunciation;

    @ManyToMany
    @JoinTable(name = "quiz_word",
            joinColumns = @JoinColumn(name = "word_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_id")
    )
    private List<QuizEntity> quizzes= new ArrayList<>();
}
