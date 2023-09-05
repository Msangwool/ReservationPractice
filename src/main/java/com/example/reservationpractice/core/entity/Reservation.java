package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

// 로뎀 스터디 룸 예약 정보입니다.
public class Reservation {

    @Id
    @NotNull
    @Column(name = "id")
    private Long reservationSeq;
    @NotNull
    @Column(name = "user_id")
    private Long userSeq;
    @NotNull
    @Column(name = "room_id")
    private Long roomSeq;
    @NotNull
    @Column(name = "user_name")
    private String userName;
    @NotNull
    @Column(name = "people_count")
    private Integer peopleCount;
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Column(name = "reservation_code")
    private String reservationCode;
}
