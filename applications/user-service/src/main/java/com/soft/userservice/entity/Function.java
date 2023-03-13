package com.soft.userservice.entity;

import com.soft.database.entity.BaseEntity;
import com.soft.userservice.entity.enums.FunctionGroupType;
import com.soft.userservice.entity.enums.FunctionName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@ToString(callSuper = true)
@Table(name = "functions")
public class Function extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private FunctionName name;

    @Enumerated(EnumType.STRING)
    private FunctionGroupType groupType;
}
