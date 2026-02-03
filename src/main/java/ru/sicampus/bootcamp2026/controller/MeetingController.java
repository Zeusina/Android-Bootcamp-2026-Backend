package ru.sicampus.bootcamp2026.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import ru.sicampus.bootcamp2026.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sicampus.bootcamp2026.dto.CreateMeetingDTO;
import ru.sicampus.bootcamp2026.dto.MeetingDTO;
import ru.sicampus.bootcamp2026.dto.mapper.MeetingMapper;
import ru.sicampus.bootcamp2026.service.MeetingService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/meeting")
@Tag(name = "Meeting controller", description = "Работа с переговорами")
public class MeetingController {

    private final MeetingService meetingService;

    @GetMapping("/{id}")
    @Schema()
    public ResponseEntity<MeetingDTO> getMeetingById(@PathVariable Long id) {
        return ResponseEntity.ok(MeetingMapper.meetingToDTO(meetingService.getById(id)));
    }

    @PostMapping("/")
    public ResponseEntity<MeetingDTO> createNewMeeting(@RequestBody CreateMeetingDTO createMeetingDTO) {
        return ResponseEntity.ok(MeetingMapper.meetingToDTO(meetingService.createNewMeeting(createMeetingDTO)));
    }

}
