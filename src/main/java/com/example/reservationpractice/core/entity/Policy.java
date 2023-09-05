package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Policy {

    @Id
    @NotNull
    @Column(name = "id")
    private Long policySeq;
    @NotNull
    private String title;
    @NotNull
    private String content;
}
