package ru.sicampus.bootcamp2026.dto;

import lombok.*;
import ru.sicampus.bootcamp2026.entity.MeetingParticipant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MeetingDTO {
    private Long id;
    private UserDTO organizer;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String title;
    private String description;
    private List<MeetingParticipantDTO> participants;
}
