package com.mongodb.demo.domain;

import java.util.Date;
import java.util.List;

public class User {

    private String name;

    private int age;

    private Date birthday;

    private List<String> familys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getFamilys() {
        return familys;
    }

    public void setFamilys(List<String> familys) {
        this.familys = familys;
    }
}
