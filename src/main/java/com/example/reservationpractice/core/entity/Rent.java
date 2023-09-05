package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Rent {

    @Id
    @NotNull
    @Column(name = "id")
    private Long rentSeq;
    @NotNull
    @Column(name = "user_id")
    private Long userSeq;
    @NotNull
    @Column(name = "user_name")
    private String userName;
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    private Integer count;
    @NotNull
    @Column(name = "rent_date")
    private String rentDate;
}
