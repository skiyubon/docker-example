package com.skiyubon.docker.service;

import com.skiyubon.docker.entity.Parent;
import com.skiyubon.docker.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:56
 */
@Service
public class ParentService {

    @Autowired
    private ParentRepository parentRepository;


    public Parent create(Parent parent) {
        return parentRepository.save(parent);
    }

    public List<Parent> findAll() {
        return parentRepository.findAll();
    }
}
