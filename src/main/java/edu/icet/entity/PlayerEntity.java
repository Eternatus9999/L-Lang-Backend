package edu.icet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PlayerEntity {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
//    @Lob
//    @Column(name = "image", columnDefinition = "LONGBLOB")
//    private byte[] photo;
}
