package org.tiaa.sma.registrationservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Version
    private Integer version;

    @Column(name="CREATE_DATE")
    @CreatedDate
    private LocalDateTime createDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name="MODIFIED_DATE")
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
}
