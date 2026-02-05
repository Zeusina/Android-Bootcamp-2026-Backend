package ru.sicampus.bootcamp2026.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDTO {
    String email;
    String firstName;
    String lastName;
    String position;
    String department;
    String avatarUrl;
}
