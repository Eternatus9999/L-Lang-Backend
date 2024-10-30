package edu.icet.entity;

import edu.icet.dto.QuizWord;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity(name = "word")

public class WordEntity {

    @Id
    private String word_id;
    private String name;
    private String pronunciation;

}
