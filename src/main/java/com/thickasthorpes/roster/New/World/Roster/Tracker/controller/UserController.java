package com.thickasthorpes.roster.New.World.Roster.Tracker.controller;

import com.thickasthorpes.roster.New.World.Roster.Tracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/getCurrentRoster")
    public void getCurrentRoster(){
    }
}
