package ru.sicampus.bootcamp2026.dto.mapper;

import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.MeetingDTO;
import ru.sicampus.bootcamp2026.entity.Meeting;

@UtilityClass
public class MeetingMapper {
    public MeetingDTO meetingToDTO(Meeting meeting) {

        return MeetingDTO.builder()
                .id(meeting.getId())
                .organizer(UserMapper.userToDTO(meeting.getOrganizer()))
                .date(meeting.getDate())
                .startTime(meeting.getStartTime())
                .endTime(meeting.getEndTime())
                .title(meeting.getTitle())
                .description(meeting.getDescription())
                .participants(meeting.getParticipants()
                        .stream()
                        .map(MeetingParticipantMapper::meetingParticipantToDTO)
                        .toList())
                .build();
    }
}
