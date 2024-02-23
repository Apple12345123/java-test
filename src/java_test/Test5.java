package java_test;

public class Test5 {
    String productName;
    int price;
    int quantity;

    public Test5(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void printOrder(String productName, int price, int quantity) {
        System.out.println("상품명 : " + productName + ", " + "가격 : " + price + ", " + "수량 : " + quantity);
    }
    void getTotalPayment(int payment) {
        payment = price * quantity;
        System.out.println(productName+ " 결제금액 : " + payment);
    }

    public static void main(String[] args) {
        Test5 order1 = new Test5("노트북", 10000000, 2);
        Test5 order2 = new Test5("마우스", 15000, 3);
        Test5 order3 = new Test5("키보드", 50000, 1);

        order1.printOrder("노트북", 10000000, 2);
        order2.printOrder("마우스", 15000, 3);
        order3.printOrder("키보드", 50000, 1);

        Test5[] orders = {order1, order2, order3};

        order1.getTotalPayment(order1.price);
        order2.getTotalPayment(order2.price);
        order3.getTotalPayment(order3.price);

        System.out.println("총 결제 금액: " + (order1.price+ order2.price + order3.price));



    }


}
