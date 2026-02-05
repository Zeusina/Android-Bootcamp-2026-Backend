package ru.sicampus.bootcamp2026.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sicampus.bootcamp2026.dto.CreateMeetingDTO;
import ru.sicampus.bootcamp2026.entity.Meeting;
import ru.sicampus.bootcamp2026.entity.MeetingParticipant;
import ru.sicampus.bootcamp2026.exception.BadRequestException;
import ru.sicampus.bootcamp2026.exception.ResourceNotFoundException;
import ru.sicampus.bootcamp2026.repository.MeetingRepository;
import ru.sicampus.bootcamp2026.repository.UserRepository;
import ru.sicampus.bootcamp2026.service.MeetingService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MeetingServiceImpl implements MeetingService {

    private final MeetingRepository meetingRepository;
    private final UserRepository userRepository;

    @Override
    public Meeting getById(Long id) {
        Optional<Meeting> meetingOptional = meetingRepository.findById(id);
        if (meetingOptional.isEmpty()) {
            throw new ResourceNotFoundException("Переговоры не найдены");
        }
        return meetingOptional.get();
    }

    @Override
    public Meeting createNewMeeting(CreateMeetingDTO createMeetingDTO) {
        Meeting meeting = Meeting.builder()
                .date(createMeetingDTO.getDate())
                .title(createMeetingDTO.getTitle())
                .description(createMeetingDTO.getDescription())
                .startTime(createMeetingDTO.getStartTime())
                .endTime(createMeetingDTO.getEndTime())
                .organizer(userRepository.findById(createMeetingDTO.getOrganizerId())
                        .orElseThrow(() -> new BadRequestException("Организатор не найден")))
                .build();

        List<Long> participantIds = createMeetingDTO.getParticipantIds();
        List<MeetingParticipant> participants = new ArrayList<>();
        for (Long participantId : participantIds) {
            MeetingParticipant meetingParticipant = MeetingParticipant.builder()
                    .participant(userRepository.findById(participantId)
                            .orElseThrow(() -> new BadRequestException("Участник переговоров не найден")))
                    .meeting(meeting)
                    .build();
            participants.add(meetingParticipant);
        }

        meeting.setParticipants(participants);

        meetingRepository.save(meeting);

        return meeting;

    }

    @Override
    public List<Meeting> getSchedule(LocalDate startDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public List<MeetingParticipant> getParticipantsByMeetingId(Long id) {
        return List.of();
    }
}
