package ch02.replayTest;

public class Person {
    public int height;
    public int weight;
    public String gender;
    public String personName;
    public int age;

    public String showPersonInfo() {
       return "키가 " + height + " 이고, 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다."
        + "이름은 " + personName + "이고 " + "나이는 " + age + "세입니다.";

    }

    public Person(int height, int weight, String gender, String personName, int age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.personName = personName;
        this.age = age;
    }
}
