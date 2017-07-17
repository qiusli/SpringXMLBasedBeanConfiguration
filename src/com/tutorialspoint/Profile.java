package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile Constructor");
    }

    public void printName() {
        System.out.println("student name is: " + student.getName());
    }

    public void printAge() {
        System.out.println("student age is: " + student.getAge());
    }
}
