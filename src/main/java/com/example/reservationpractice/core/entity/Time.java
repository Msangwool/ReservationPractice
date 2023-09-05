package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

// 로뎀 예약 가능 시간입니다.
public class Time {

    @Id
    @NotNull
    @Column(name = "id")
    private Long timeSeq;
    @NotNull
    private Day day;
    @NotNull
    private String time;
}
