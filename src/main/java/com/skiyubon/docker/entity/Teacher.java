package com.skiyubon.docker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/3/29 下午 3:33
 */

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String sex;

    private String level;

    @OneToMany(mappedBy = "teacher")
    private Set<Student> students;
}
