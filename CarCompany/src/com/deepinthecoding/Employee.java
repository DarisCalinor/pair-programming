package com.deepinthecoding;

public class Employee {

    private boolean isBusy;
    private String name;
    private String title;
    private int id;

    // Default constructor
    public Employee() {
    this("PP","Fresher",1);
    }

    public Employee(String name, String title, int id) {
        this.isBusy = false;
        this.name = name;
        this.title = title;
        this.id = id;
    }

    public void recieveCall(int customerId) {
        System.out.println(this.name + " has answered call from " + customerId);
    }

    public void closeCall() {
        System.out.println("Customer has satisfacted.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
