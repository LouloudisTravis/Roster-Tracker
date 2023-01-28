package com.thickasthorpes.roster.New.World.Roster.Tracker.dtos;

import lombok.*;

import java.io.File;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDTO {
    private String gameName;
    private String companyName;
    private String characterName;
    private File gearImage;
}
