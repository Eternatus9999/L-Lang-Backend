package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity(name = "quiz_word")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizWordEntity implements Serializable {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private QuizEntity quiz;

    @ManyToOne
    @JoinColumn(name = "word_id")
    private WordEntity word;

    private String status;
}
