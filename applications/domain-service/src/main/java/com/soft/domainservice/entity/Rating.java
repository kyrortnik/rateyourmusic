package com.soft.domainservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "ratings")
@ToString(callSuper = true)
public class Rating extends BaseEntity {
    private Double value;

    @Column(name = "creator_id")
    private String creatorId;
}
