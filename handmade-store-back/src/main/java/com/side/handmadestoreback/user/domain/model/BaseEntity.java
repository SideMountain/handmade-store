package com.side.handmadestoreback.user.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {
  
  @Column(name = "created_date")
  private LocalDateTime createdDate;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "updated_date")
  private LocalDateTime updatedDate;

  @Column(name = "updated_by")
  private String updatedBy;

  @Column(name = "version")
  private Integer version;
}
