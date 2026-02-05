package ru.sicampus.bootcamp2026.dto.mapper;

import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.MeetingParticipantDTO;
import ru.sicampus.bootcamp2026.entity.MeetingParticipant;

@UtilityClass
public class MeetingParticipantMapper {
    MeetingParticipantDTO meetingParticipantToDTO(MeetingParticipant meetingParticipant) {
        return MeetingParticipantDTO.builder()
                .participant(UserMapper.userToDTO(meetingParticipant.getParticipant()))
                .status(meetingParticipant.getParticipantStatus())
                .build();
    }
}
