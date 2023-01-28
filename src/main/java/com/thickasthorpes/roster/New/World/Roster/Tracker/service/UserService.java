package com.thickasthorpes.roster.New.World.Roster.Tracker.service;

import com.thickasthorpes.roster.New.World.Roster.Tracker.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void getCurrentRoster() {

    }

    void saveNewCharacter(){

    };

    void deleteCharacter(){

    };

    void updateCharacter(){};

}
