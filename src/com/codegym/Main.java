package com.codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnaleDemo runnaleDemo1 = new RunnaleDemo("Thread-1-HR-Database");
        runnaleDemo1.start();

        RunnaleDemo runnaleDemo2 = new RunnaleDemo("Thread-2-Send-Email");
        runnaleDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
