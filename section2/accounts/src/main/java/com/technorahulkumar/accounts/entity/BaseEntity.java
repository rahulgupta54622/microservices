package com.technorahulkumar.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@MappedSuperclass
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime createdAt;

    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;
    
    @Column(insertable = false)
    private String updatedBy;
}
