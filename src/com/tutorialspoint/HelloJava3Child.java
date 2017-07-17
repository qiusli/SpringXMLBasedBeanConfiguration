package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class HelloJava3Child {
    private String message1, message2, message3;

    public void getMessage3() {
        System.out.print("child get message 3: " + message3);
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public void getMessage2() {
        System.out.print("child get message 2: " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage1() {
        System.out.print("child get message 1: " + message1);

        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }
}
