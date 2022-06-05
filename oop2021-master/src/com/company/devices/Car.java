package com.company.devices;

public class Car extends Device implements Refillable, Comparable<Car> {

    public Double engineSize;
    public String fuelType;
    public Engine engine;
    public boolean isRunning;

    public Car(String producer, String model) {
        super(producer, model);
        this.engine = new Engine();


    }

    public void startACar() {
        this.engine.turnOn();
    }

    public void stopACar() {
        this.engine.turnOff();
    }


    @Override
    public void turnOn() {
        System.out.println("Turning the key...");
        System.out.println("Engine starts...");
        System.out.println("You can drive!");

    }

    @Override
    public void refill() {
        System.out.println("Go to gas station");
        System.out.println("Fill up the tank");
        System.out.println("Pay");
    }


    @Override
    public void refillToFull() {

    }

    @Override
    public int compareTo(Car car) {
        return (int) (this.engineSize - car.engineSize);

    }

    private class Engine {
        public int horsePower;
        public double volume;
        public double mileage;


        public void turnOn() {
            System.out.println("Turning the key..");
            System.out.println("Engine starts..");
            System.out.println("You can drive!");
            System.out.println("NITRO!");
            isRunning = true;
        }

        public void turnOff() {
            System.out.println("The car is off..");
            isRunning = false;
        }


    }


}
