package ru.sicampus.bootcamp2026.service;

import org.apache.coyote.BadRequestException;
import ru.sicampus.bootcamp2026.dto.CreateMeetingDTO;
import ru.sicampus.bootcamp2026.entity.Meeting;
import ru.sicampus.bootcamp2026.entity.MeetingParticipant;

import java.time.LocalDate;
import java.util.List;

public interface MeetingService {
    Meeting getById(Long id);

    Meeting createNewMeeting(CreateMeetingDTO createMeetingDTO);

    List<Meeting> getSchedule(LocalDate startDate, LocalDate endDate);

    List<MeetingParticipant> getParticipantsByMeetingId(Long id);
}
