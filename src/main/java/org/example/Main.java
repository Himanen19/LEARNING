package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("a good car");
        HybridCar hybridCar = new HybridCar("great ");
        EletricCar eletricCar = new EletricCar("tesla", 300, 10);
        GasPoweredCar gasPoweredCar = new GasPoweredCar("x D car", 34.2, 4);

        runCar(eletricCar);

        runCar(gasPoweredCar);



    }

    public static void runCar(Car c) {
        c.startEngine();
        c.drive();

    }
    }


class Car3 {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car3(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "The engine is starting" + this.getClass().getSimpleName();
    }

    public String accelerate() {

        return "the Car is accelerating..." + this.getClass().getSimpleName();
    }

    public String brake() {

        return "the car is breaking" + this.getClass().getSimpleName();
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car3 {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The mitsubishi engine is starting" + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the mitsubishi is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the mitsubishi is breaking" + this.getClass().getSimpleName();
    }

}

class Holden extends Car3 {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Holden engine is starting " + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the Holden is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the Holden is breaking" + this.getClass().getSimpleName();
    }

}

class Ford extends Car3 {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford engine is starting" + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the Ford is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the Ford is breaking" + this.getClass().getSimpleName();
    }

}