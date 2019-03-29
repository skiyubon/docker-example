package com.skiyubon.docker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/3/28 上午 11:31
 */

@Entity
@Data
public class Student {

    @Id
    private Long id;

    private String name;

    private Integer age;
}
