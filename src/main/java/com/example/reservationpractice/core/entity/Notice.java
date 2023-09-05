package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Notice {

    @Id
    @NotNull
    @Column(name = "id")
    private Long noticeSeq;
    @NotNull
    @Column(name = "user_id")
    private Long userSeq;
    @NotNull
    private String title;
    @NotNull
    private String content;
}
