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
    private long quiz_id;
    private LocalDate date;
    private String grade;
    private int mark;
    private List<Word> words;


}
