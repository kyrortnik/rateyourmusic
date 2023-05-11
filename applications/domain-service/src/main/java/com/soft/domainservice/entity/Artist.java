package com.soft.domainservice.entity;

import com.soft.domainservice.entity.enums.ArtistType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "artists")
@ToString(callSuper = true)
public class Artist extends BaseEntity {
    private String name;

    @Enumerated(EnumType.STRING)
    private ArtistType type;

    @ManyToMany(mappedBy = "composers")
    private Set<Song> songs;
}
