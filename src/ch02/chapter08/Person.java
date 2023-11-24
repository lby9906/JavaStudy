package ch02.chapter08;

public class Person {
    String name;
    int age;

    public Person(){
        this("no name" ,1); //초기화시켜주고싶을때, 같은 조건을 가진 다른 생성자 호출
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);
        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
