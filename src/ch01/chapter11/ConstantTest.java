package ch01.chapter11;

public class ConstantTest {

    public static void main(String[] args) {

        //final 상수를 쓰면 변하지 않는 값이라 변경도 x
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;
        //MAX_NUM = 20;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
