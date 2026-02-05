package ru.sicampus.bootcamp2026.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MeetingParticipantId implements Serializable {

    @Column(name = "meeting_id")
    private Long meetingId;

    @Column(name = "participant_id")
    private Long participantId;
}
