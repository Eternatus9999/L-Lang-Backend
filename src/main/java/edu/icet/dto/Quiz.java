package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Quiz {
    private String quiz_id;
    private String player_id;
    private LocalDate date;
    private String grade;
    private int mark;
    private List<QuizWord> words;


}
