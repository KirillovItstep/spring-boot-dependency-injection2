package com.example.springbootdependencyinjection2.di_car;

public class DIDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        DICar diCar = new DICar(new CarEngine());
        diCar.start();

        DIMCar dimCar = new DIMCar();
        dimCar.setEngine(new CarEngine());
        dimCar.start();
    }
}

interface IEngine{
    void start();
}

class CarEngine implements IEngine{

    @Override
    public void start() {
        System.out.println("Car engine is starting");
    }
}

//Без использования Dependency Injection
class Car{

    public void start(){
        IEngine engine = new CarEngine();
        engine.start();
    }
}

//С использованием Dependency Injection посредством конструктора
class DICar{
    private IEngine engine;

    public DICar(IEngine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}

//С использованием Dependency Injection посредством метода
class DIMCar{

    private IEngine engine;

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}