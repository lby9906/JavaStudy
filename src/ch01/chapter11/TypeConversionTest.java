package ch01.chapter11;

public class TypeConversionTest {

    public static void main(String[] args) {

//        int iNum = 255;
//        byte bNUm = (byte) iNum;
//
//        System.out.println(bNUm);
//
//        double dNum = 3.14;
//        int inum = (int) dNum;
//
//        System.out.println(inum);

        double dNUm = 1.2;
        float fNum = 0.9F;

        int uNUm1 = (int)dNUm + (int) fNum;
        int iNUm2 = (int)(dNUm + fNum);

        System.out.println(uNUm1);
        System.out.println(iNUm2);


        int myNUm  = 10;
        int yourNum = 20;

        myNUm += yourNum;
        System.out.println(myNUm);
    }
}
