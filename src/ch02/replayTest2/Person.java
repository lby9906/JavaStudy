package ch02.replayTest2;

public class Person {

    String personName;
    int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void take(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showPersonInfo() {
        System.out.println(personName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
