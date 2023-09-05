package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

// 관리자가 특정 상황에서 On 으로 만들지 않을 시간대를 미리 저장합니다.
public class UnAvailableTime {

    @Id
    @NotNull
    @Column(name = "id")
    private Long unAvailableTimeSeq;
    @NotNull
    @Column(name = "time_id")
    private Long timeSeq;
}
