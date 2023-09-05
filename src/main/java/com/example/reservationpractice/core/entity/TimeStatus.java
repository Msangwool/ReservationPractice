package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

// 로뎀 시간 예약입니다. 해당 시간을 탐색하여 예약 가능 시간 및 불가능한 시간을 노출합니다.
public class TimeStatus {

    @Id
    @NotNull
    @Column(name = "id")
    private Long timeStatusSeq;
    @NotNull
    @Column(name = "time_id")
    private Long timeSeq;
    @NotNull
    @Column(name = "time_id")
    private Long roomSeq;
    @Column(name = "reservation_id")
    private Long reservationSeq;
    @NotNull
    @Column(name = "time_id")
    private Boolean status;
}
