package ch02.replayTest3;

public class Car {

    private static int carId = 1000;

    private int carNum;


    public Car() {
        carId++;
        carNum = carId;
    }

    public int getCarNum() {
        return carNum;
    }

    public static int getCarId() {
        return carId;
    }
}
