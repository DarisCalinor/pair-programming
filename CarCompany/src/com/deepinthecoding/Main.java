package com.deepinthecoding;

public class Main {

    public static void main(String[] args) {

        Fresher fr1 = new Fresher("efe", 1);
        Fresher[] freshers = new Fresher[]{fr1};
        // Customer IDs
        int[] pendingCustomers = new int[]{1, 2, 3};
        System.out.println(freshers[0] + fr1.getName());

        //getCallHandler(pendingCustomers[0], pickFresher());
        pickFresher(fr1,pendingCustomers[0]);
        pickFresher(fr1,pendingCustomers[0]);
    }

    public static int pickFresher(Fresher fresher, int customerNumber) {
        if (fresher.isBusy() == false) {
            System.out.println("Customer number " + customerNumber + " is having a call with "
                    + fresher.getId());
            fresher.setBusy(true);
            return fresher.getId();
        } else {
            System.out.println("All freshers are busy, wait.");
            return -1;
        }
    }
}