package com.thickasthorpes.roster.New.World.Roster.Tracker.service;

import com.thickasthorpes.roster.New.World.Roster.Tracker.daos.User;
import com.thickasthorpes.roster.New.World.Roster.Tracker.dtos.CurrentRosterDTO;
import com.thickasthorpes.roster.New.World.Roster.Tracker.dtos.UserDTO;
import com.thickasthorpes.roster.New.World.Roster.Tracker.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public CurrentRosterDTO getCurrentRoster() {
        if(userRepository.findAll() != null){
            return new CurrentRosterDTO(UserConverter.convertListToDTOs(userRepository.findAll()));
        }
       return null;
    };
    public void saveNewCharacter(UserDTO userDTO){
        userRepository.save(UserConverter.convertToDAO(userDTO));
    };
    public void deleteCharacter(UserDTO userDTO){
        userRepository.delete(UserConverter.convertToDAO(userDTO));
    };
    public UserDTO updateCharacter(UserDTO userDTO){
        User savedUser = userRepository.save(UserConverter.convertToDAO(userDTO));
        return UserConverter.convertToDTO(savedUser);
    };
}
