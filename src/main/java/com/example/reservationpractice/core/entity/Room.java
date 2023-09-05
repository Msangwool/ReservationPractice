package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

// 로뎀 방 상세 정보입니다.
public class Room {

    @Id
    @NotNull
    @Column(name = "id")
    private Long roomSeq;
    @NotNull
    @Column(name = "room_name")
    private String roomName;
    @NotNull
    @Column(name = "room_explanation")
    private String roomExplanation;
    @NotNull
    @Column(name = "people_count")
    private Integer peopleCount;
    private String location;
}
