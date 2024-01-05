package class1.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        int sum = (order1.price * order1.quantity) + (order2.price * order2.quantity) + (order3.price * order3.quantity);

        System.out.println("상품명: " + order1.productName + ", 가격: " + order1.price + ", 수량: " + order1.quantity);
        System.out.println("상품명: " + order2.productName + ", 가격: " + order2.price + ", 수량: " + order2.quantity);
        System.out.println("상품명: " + order3.productName + ", 가격: " + order3.price + ", 수량: " + order3.quantity);
        System.out.println("총 결제 금액: " + sum);
    }
}
