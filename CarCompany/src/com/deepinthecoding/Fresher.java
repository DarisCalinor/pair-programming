package com.deepinthecoding;

public class Fresher extends Employee {

    public Fresher(String name, int id) {
        super(name, "Fresher", id);
    }

    public void forwardCall(Object customer) {
        System.out.println("Call couldnt be handled, being forwarded to the Technical Lead.");
    }
}
