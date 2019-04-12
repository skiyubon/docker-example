package com.skiyubon.docker.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/3/28 上午 11:31
 */

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    @Column(name = "parent_id")
    private Long parentId;

    @OneToOne
    @JoinColumn(name = "parent_id",insertable = false,updatable = false,foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
