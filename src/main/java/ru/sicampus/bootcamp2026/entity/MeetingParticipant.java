package ru.sicampus.bootcamp2026.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "meeting_participants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class MeetingParticipant {

    @EmbeddedId
    @Builder.Default
    private MeetingParticipantId id = new MeetingParticipantId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("meetingId")
    @JoinColumn(name = "meeting_id", nullable = false, foreignKey = @ForeignKey(name = "meeting"))
    private Meeting meeting;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("participantId")
    @JoinColumn(name = "participant_id", nullable = false, foreignKey = @ForeignKey(name = "participant"))
    private User participant;

    @Enumerated(EnumType.STRING)
    @Column(name = "participant_status", nullable = false, columnDefinition = "participant_status")
    private ParticipantStatus participantStatus;

    public MeetingParticipant(Meeting meeting, User participant, ParticipantStatus status) {
        this.meeting = meeting;
        this.participant = participant;
        this.participantStatus = status;
        this.id = new MeetingParticipantId(meeting.getId(), participant.getId());
    }
}
