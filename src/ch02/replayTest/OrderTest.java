package ch02.replayTest;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order("202011020003","01023450001","서울시 강남구 역삼동 111-333", "20201102","130258",35000,"003");

        System.out.println(order1.showOrderInfo());
    }
}
