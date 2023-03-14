package com.soft.domainservice.entity;

import com.soft.database.entity.BaseEntity;
import com.soft.domainservice.entity.enums.ArtistType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
public class Artist extends BaseEntity {
    private String name;
    @Enumerated(EnumType.STRING)
    private ArtistType type;
}
