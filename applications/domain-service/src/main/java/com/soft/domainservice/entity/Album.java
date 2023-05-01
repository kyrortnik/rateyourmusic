package com.soft.domainservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "albums")
@ToString(callSuper = true)
public class Album extends BaseEntity {
    private String title;
    @ManyToOne
    @JoinColumn(name = "composer_id")
    private Artist composer;
}
