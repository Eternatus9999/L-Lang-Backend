package edu.icet.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Quiz {
    private long quiz_id;
    private Local date;
    private String grade;
    private int mark;
    private List<Word> words;


}
