package com.thickasthorpes.roster.New.World.Roster.Tracker.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CurrentRosterDTO {
    private List<UserDTO> currentUsers;
}
