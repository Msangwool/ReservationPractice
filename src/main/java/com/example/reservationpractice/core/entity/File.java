package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class File {

    @Id
    @NotNull
    @Column(name = "id")
    private Long fileSeq;
    @NotNull
    private String path;
    @NotNull
    @Column(name = "file_type")
    private String fileType;
}
