package com.wangzhen.spbunittest.repository;

import com.wangzhen.spbunittest.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName StudentRepository
 * @Description
 * @Author momo
 * @Date 2019/2/6 上午9:52
 **/
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
