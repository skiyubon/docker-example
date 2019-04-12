package com.skiyubon.docker.service;

import com.skiyubon.docker.entity.Student;
import com.skiyubon.docker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuzhou
 * @version 1.0
 * @date 2019/4/12 上午 11:50
 */

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student create(Student student) {
        return repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
