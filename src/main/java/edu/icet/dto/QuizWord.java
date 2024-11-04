package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
public class QuizWord{

    private long id;
    private long word_id;
    private String name;
    private String pronunciation;
    private String status;

    public QuizWord(long word_id, String name, String pronunciation, String status){
        this.word_id = word_id;
        this.name = name;
        this.pronunciation = pronunciation;
        this.status = status;
    }

}
