package ch02.replayTest2;

public class TakeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Edward", 20000);

        Taxi taxi = new Taxi("잘나간다 운수");

        person1.take(taxi);

        person1.showPersonInfo();
        taxi.showTaxiInfo();

    }
}
