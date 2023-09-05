package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class TableTest {
    @NotNull
    @Column(name = "created_by")
    private String createdBy;
    @NotNull
    @Column(name = "createdAy")
    private String createdAt;
    @NotNull
    @Column(name = "modified_by")
    private String modifiedBy;
    @NotNull
    @Column(name = "modified_at")
    private String modifiedAt;
}
