package com.thickasthorpes.roster.New.World.Roster.Tracker.daos;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.File;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Must have a game name.")
    private String gameName;

    @NotBlank(message = "Must have a character name.")
    private String companyName;

    @NotBlank(message = "Must have a company name.")
    private String characterName;

    @NotBlank(message = "Must have gear image.")
    private File gearImage;

}
