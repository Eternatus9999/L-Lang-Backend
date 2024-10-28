package edu.icet.dto;

import edu.icet.entity.QuizEntity;
import edu.icet.entity.WordEntity;
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
    private Quiz quiz_id;
    private Word word_id;
    private String status;
}
