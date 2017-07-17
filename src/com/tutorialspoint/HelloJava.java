package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class HelloJava {
    String message;
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message: " + message);
    }

    public void init() {
        System.out.println("Your bean has been initialized");
    }

    public void destroy() {
        System.out.println("You bean will be destroyed");
    }
}
