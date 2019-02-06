package com.wangzhen.spbunittest.service;

import com.wangzhen.spbunittest.bean.Student;
import com.wangzhen.spbunittest.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @ClassName SchoolService
 * @Description
 * @Author momo
 * @Date 2019/2/6 上午9:53
 **/
@Service
public class SchoolService {

    // 定义数据访问层接口对象
    @Resource
    private StudentRepository studentRepository;

    @Transactional
    public void save(Student stu) {
        studentRepository.save(stu);
    }

    public Student selectByKey(Integer id) {
        Optional<Student> op = studentRepository.findById(id);
        return op.get();
    }

}
