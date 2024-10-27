package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.cglib.core.Local;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Quiz {
    private String id;
    private Local date;
    private String grade;
    private int mark;


}