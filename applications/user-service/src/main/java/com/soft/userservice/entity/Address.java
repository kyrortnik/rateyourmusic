package com.soft.userservice.entity;

import com.soft.database.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
public class Address extends BaseEntity {
    private String country;
    private String city;
    private String state;
    private String street;
    private String building;
    private Integer room;
}
