package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloJava obj = (HelloJava) context.getBean("helloJava");
        obj.getMessage();

        HelloJava2 obj2 = (HelloJava2) context.getBean("helloJava2");
        obj2.setMessage("hello java 2");
        obj2.getMessage();

        HelloJava2 obj3 = (HelloJava2) context.getBean("helloJava2");
        obj3.getMessage();

        context.registerShutdownHook();
    }
}
