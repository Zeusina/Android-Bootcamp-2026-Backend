package ru.sicampus.bootcamp2026.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
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
public class CreateMeetingDTO {
    private Long organizerId;
    @Schema(type = "string", format = "date", example = "2026-02-03")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @Schema(type = "string", format = "time", example = "11:30")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;
    @Schema(type = "string", format = "time", example = "12:15")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;
    private String title;
    private String description;
    private List<Long> participantIds;
}
