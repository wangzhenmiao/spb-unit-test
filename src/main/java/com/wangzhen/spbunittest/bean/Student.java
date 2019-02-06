package com.wangzhen.spbunittest.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName Student
 * @Description
 * @Author momo
 * @Date 2019/2/6 上午9:51
 **/
@Entity
@Table(name="tb_student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String address ;
    private int age ;
    private char sex;
    public Student() {

    }
    public Student(String name, String address, int age, char sex) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}