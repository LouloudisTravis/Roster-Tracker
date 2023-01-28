package com.thickasthorpes.roster.New.World.Roster.Tracker.service;

import com.thickasthorpes.roster.New.World.Roster.Tracker.daos.User;
import com.thickasthorpes.roster.New.World.Roster.Tracker.dtos.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {
    public static UserDTO convertToDTO(User user){
        return UserDTO.builder()
                .companyName(user.getCompanyName())
                .gameName(user.getGameName())
                .gearImage(user.getGearImage())
                .characterName(user.getCharacterName())
                .build();
    }
    public static List<UserDTO> convertListToDTOs(List<User> users){
        List<UserDTO> dtoList = new ArrayList<>();
        for(User user: users){
            dtoList.add(convertToDTO(user));
        }
        return dtoList;
    }
    public static User convertToDAO(UserDTO userDTO) {
        return User.builder()
                .companyName(userDTO.getCompanyName())
                .gameName(userDTO.getGameName())
                .gearImage(userDTO.getGearImage())
                .characterName(userDTO.getCharacterName())
                .build();
    }
}
