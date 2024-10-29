package edu.icet.dto;

import edu.icet.entity.QuizEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizWord implements Serializable {
    private long id;
    private String question;
    private String answer;
    private String status;
    private QuizEntity quiz;
}
