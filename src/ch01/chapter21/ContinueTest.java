package ch01.chapter21;

public class ContinueTest {
    public static void main(String[] args) {

        int num;

//        for (int i=1; i<=100; i++) { //-> 내가 구현한것
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        for (num=1; num<=100; num++) {

            if ((num % 3)  != 0) continue;

            System.out.println(num);
        }
    }
}
