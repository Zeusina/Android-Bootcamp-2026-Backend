package ru.sicampus.bootcamp2026.dto;

import lombok.*;
import ru.sicampus.bootcamp2026.entity.ParticipantStatus;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeetingParticipantDTO {
    UserDTO participant;
    ParticipantStatus status;
}
