package edu.icet.entity;

import jakarta.persistence.*;
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
    private String question;
    private String answer;
    private String status;

    @ManyToOne
    @JoinColumn(name = "quiz_id",referencedColumnName = "quiz_id")
    private QuizEntity quiz;
}
