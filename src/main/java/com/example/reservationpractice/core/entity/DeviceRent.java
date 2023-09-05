package com.space.haramspring.core.entity.rothemnew;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class DeviceRent {

    @Id
    @NotNull
    @Column(name = "id")
    private Long deviceRentSeq;
    @NotNull
    @Column(name = "rent_id")
    private Long rentSeq;
    @NotNull
    @Column(name = "device_id")
    private Long deviceSeq;
}
