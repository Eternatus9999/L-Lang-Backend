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
public class QuizWordEntity{
    @Id
    private String word_id;
    private String name;
    private String pronunciation;
    private String status;

}

