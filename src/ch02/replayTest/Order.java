package ch02.replayTest;

public class Order {

    public String orderNumber;
    public String orderPhoneNumber;
    public String homeAddress;
    public String date;
    public String time;
    public int price;
    public String menuNumber;

    public String showOrderInfo() {
        return "주문 접수 번호 : " + orderNumber + "\n" +
               "주문 핸드폰 번호 : " +  orderPhoneNumber + "\n" +
                "주문 집 주소 : " + homeAddress + "\n" +
                "주문 날짜 : " + date + "\n" +
                "주문 시간 : " + time + "\n" +
                "주문 가격 : " + price + "\n" +
                "메뉴 번호 : " + menuNumber;
    }

    public Order(String orderNumber, String orderPhoneNumber, String homeAddress, String date, String time, int price, String menuNumber) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.homeAddress = homeAddress;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }
}
