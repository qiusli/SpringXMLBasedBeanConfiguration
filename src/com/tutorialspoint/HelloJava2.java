package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class HelloJava2 {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message: " + message);
    }
}
