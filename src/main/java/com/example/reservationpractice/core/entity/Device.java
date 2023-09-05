package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Device {

    @Id
    @NotNull
    @Column(name = "id")
    private Long deviceSeq;
    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private Integer count;
    @Column(name = "current_count")
    private Integer currentCount;
}
