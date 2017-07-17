package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloJava3Parent parent = (HelloJava3Parent) context.getBean("helloJava3Parent");
        parent.getMessage1();
        parent.getMessage2();

        HelloJava3Child child = (HelloJava3Child) context.getBean("helloJava3Child");
        child.getMessage1();
        child.getMessage2();
        child.getMessage3();

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollections");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
        javaCollection.getAddressSet();

        Student student = (Student) context.getBean("student");
        System.out.println("student name: " + student.getName());
        System.out.println("student age: " + student.getAge());

        TextEditor2 textEditor2 = (TextEditor2) context.getBean("textEditor2");
        textEditor2.spellCheck();

        TextEditor3 textEditor3 = (TextEditor3) context.getBean("textEditor3");
        textEditor3.spellCheck();

        Profile profile = (Profile) context.getBean("profile");
        profile.printName();
        profile.printAge();
    }
}
