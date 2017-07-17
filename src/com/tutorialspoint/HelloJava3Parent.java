package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class HelloJava3Parent {
    private String message1, message2;

    public void getMessage1() {
        System.out.print("parent get message 1: " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.print("parent get message 2: " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
