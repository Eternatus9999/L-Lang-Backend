package edu.icet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Player")

public class PlayerEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String gender;
    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB")
    private byte[] photo;
}
