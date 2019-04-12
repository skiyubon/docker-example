package com.skiyubon.docker.repository;

import com.skiyubon.docker.entity.Student;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:50
 */
public interface StudentRepository extends JpaRepositoryImplementation<Student,Long> {



}
