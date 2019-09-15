package com.godda.ohara.models.character;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Character {

    private Long id;
    private String name;
    private LocalDate birthDate;

    private String gender;
    private String role;
    private String occupation;
    private boolean cannon;

    private String epithet;

    private String status;
    private String bloodType;

}
