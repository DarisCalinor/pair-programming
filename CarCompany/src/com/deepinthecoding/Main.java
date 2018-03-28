package com.deepinthecoding;

import java.util.LinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Fresher fr1 = new Fresher("efe", 1);
        Fresher fr2 = new Fresher("candogan",2);
        Fresher[] freshers = new Fresher[]{fr1,fr2};
        // Customer IDs
        // int[] pendingCustomers = new int[]{1, 2, 3};

        LinkedList pendingCustomers = new LinkedList();
        pendingCustomers.addLast(1);
        pendingCustomers.addLast(2);
        pendingCustomers.addLast(3);

        callHandler(pickCustomer(pendingCustomers),pickFresher(fr1));
        callHandler(pickCustomer(pendingCustomers),pickFresher(fr2));
        callHandler(pickCustomer(pendingCustomers),pickFresher(fr1));
        callHandler(pickCustomer(pendingCustomers),pickFresher(fr2));
        callHandler(pickCustomer(pendingCustomers),pickFresher(fr1));
        callHandler(pickCustomer(pendingCustomers),pickFresher(fr2));





    }

    public static Object pickCustomer(LinkedList pendingCustomers) {
        if (!pendingCustomers.isEmpty()) {
            Object customer = pendingCustomers.getFirst();
            pendingCustomers.removeFirst();

            return customer;
        }
        System.out.println("There are no pending customers.");
        return -1;
    }

    public static Fresher pickFresher(Fresher fresher) {
        if (!fresher.isBusy()) {
            fresher.setBusy(true);
            return fresher;
        }
        System.out.println("All freshers are busy. Please wait.");
        return null;
    }

    public static void callHandler(Object customer, Fresher fresher){
        boolean callHandled = false;
        fresher.recieveCall(customer);
        Random randomBoolean = new Random();
        callHandled = randomBoolean.nextBoolean();
        if (callHandled){
            fresher.closeCall();
            fresher.setBusy(false);
        }else {
            fresher.forwardCall(customer);
            fresher.setBusy(false);
        }

    }

    /*public static int pickFresher(Fresher fresher, int customerNumber) {
        if (fresher.isBusy() == false) {
            System.out.println("Customer number " + customerNumber + " is having a call with "
                    + fresher.getId());
            fresher.setBusy(true);
            return fresher.getId();
        } else {
            System.out.println("All freshers are busy, wait.");
            return -1;
        }
    }*/
}