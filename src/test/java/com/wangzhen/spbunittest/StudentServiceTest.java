package com.wangzhen.spbunittest;

import com.wangzhen.spbunittest.bean.Student;
import com.wangzhen.spbunittest.service.SchoolService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName StudentServiceTest
 * @Description
 * @Author momo
 * @Date 2019/2/6 上午9:57
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    // 注入Service
    @Autowired
    private SchoolService studentService;

    @Test
    public void findOne() throws Exception {
        Student stu = studentService.selectByKey(1);
        Assert.assertThat(stu.getName(), CoreMatchers.is("孙悟空"));
    }
}
