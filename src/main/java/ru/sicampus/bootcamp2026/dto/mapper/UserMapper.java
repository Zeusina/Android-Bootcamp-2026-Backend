package ru.sicampus.bootcamp2026.dto.mapper;

import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.UserDTO;
import ru.sicampus.bootcamp2026.entity.User;

@UtilityClass
public class UserMapper {
    public UserDTO userToDTO(User user) {
        return UserDTO.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .department(user.getDepartment())
                .position(user.getPosition())
                .avatarUrl(user.getAvatarUrl())
                .build();
    }
}
