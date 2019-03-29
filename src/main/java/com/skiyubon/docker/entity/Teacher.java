package com.skiyubon.docker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/3/29 下午 3:33
 */

@Data
@Entity
public class Teacher {

    @Id
    private Long id;

    private String name;

    private String sex;

    private String level;
}
