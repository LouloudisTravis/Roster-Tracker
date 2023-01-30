package com.thickasthorpes.roster.New.World.Roster.Tracker.controller;

import com.thickasthorpes.roster.New.World.Roster.Tracker.dtos.CurrentRosterDTO;
import com.thickasthorpes.roster.New.World.Roster.Tracker.dtos.UserDTO;
import com.thickasthorpes.roster.New.World.Roster.Tracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/currentRoster")
    public CurrentRosterDTO getCurrentRoster(){
        return userService.getCurrentRoster();
    }
    @PostMapping("/user")
    public void saveNewUser(@RequestBody UserDTO userDTO){
        userService.saveNewCharacter(userDTO);
    }
    @DeleteMapping("/user")
    public void deleteUser(@RequestBody UserDTO userDTO){
        userService.deleteCharacter(userDTO);
    }
    @PutMapping("/user")
    public UserDTO updateExistingUser(@RequestBody UserDTO userDTO){
        return userService.updateCharacter(userDTO);
    }
}
