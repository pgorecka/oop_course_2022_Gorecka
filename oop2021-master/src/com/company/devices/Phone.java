package com.company.devices;

import java.util.List;

public class Phone extends Device implements Refillable {
    private static final String DEFAULT_VERSION = "latest";
    public final Double screenSize;
    public OperatingSystem os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, OperatingSystem os) {
        super(producer, model);
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    public void turnOn() {
        switch (this.os) {
            case iOS -> System.out.println("show a bitten apple");
            case Android -> System.out.println("show a little robot");
            case WindowsMobile -> System.out.println("show 4 squares");
        }
    }

    @Override
    public void refill() {
        System.out.println("charge it");
        System.out.println("wait");
        System.out.println("wait some more");
    }

    @Override
    public void refillToFull() {
        System.out.println("charge it");
        System.out.println("wait");
        System.out.println("wait as long as needed");
    }


    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String version) {

    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

}
