package com.skiyubon.docker.repository;

import com.skiyubon.docker.entity.Parent;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:56
 */
public interface ParentRepository extends JpaRepositoryImplementation<Parent,Long> {
}
