package com.skiyubon.docker.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:34
 */

@Data
@Entity
@ApiModel
public class Parent {

    @Id
    @GeneratedValue
    private Long id;

    @ApiModelProperty("fatherName")
    private String fatherName;

    @ApiModelProperty("fatherAge")
    private Integer fatherAge;

    @ApiModelProperty("fatherJob")
    private String fatherJob;

    @ApiModelProperty("motherName")
    private String motherName;


    @ApiModelProperty("motherAge")
    private Integer motherAge;

    @ApiModelProperty("motherJob")
    private String motherJob;
}
