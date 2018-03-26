package com.deepinthecoding;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Fresher fr1 = new Fresher("efe", 1);
        Fresher[] freshers = new Fresher[]{fr1};
        // Customer IDs
        // int[] pendingCustomers = new int[]{1, 2, 3};

        LinkedList pendingCustomers = new LinkedList();
        pendingCustomers.addLast(1);
        pendingCustomers.addLast(2);
        pendingCustomers.addLast(3);

        System.out.println(pendingCustomers);
        System.out.println(pickCustomer(pendingCustomers));
        System.out.println(pendingCustomers);
    }

    public static Object pickCustomer(LinkedList pendingCustomers) {
        if (!pendingCustomers.isEmpty()) {
            Object customer = pendingCustomers.getFirst();
            pendingCustomers.removeFirst();

            return customer;
        }
        return -1;
    }

    public String pickFresher(Fresher fresher) {
        if (!fresher.isBusy()) {
            fresher.setBusy(true);
            return fresher.getName();
        }
        return "-1";
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