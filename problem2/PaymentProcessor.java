public class PaymentProcessor {
    private Order order;

    public PaymentProcessor(Order order) {
        this.order = order;
    }

    public void processPayment() {

        System.out.println("订单已付款: " + order);
    }
}
