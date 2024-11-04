package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "word")

public class WordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long word_id;
    private String name;
    private String pronunciation;

}
