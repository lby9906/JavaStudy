package ch02.replayTest3;

public class CarFactory {

    private static CarFactory instance = new CarFactory();


    public static CarFactory getInstance() {
        return instance;
    }

    public Car creatCar() {
        Car car = new Car();
        return car;
    }

}
