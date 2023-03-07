package com.soft.userservice.entity;

import com.soft.database.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@Table(name = "users")
public class User extends BaseEntity {

    private String email;
    private String username;
    private String password;

    @ToString.Exclude
    @OneToMany(mappedBy = "user")
    private List<UserProfile> userProfiles = new ArrayList<>();
}
