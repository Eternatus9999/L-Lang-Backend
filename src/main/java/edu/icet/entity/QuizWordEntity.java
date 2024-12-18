package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "quiz_word")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizWordEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private long word_id;
    private String name;
    private String pronunciation;
    private String status;

}

