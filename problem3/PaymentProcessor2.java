public class PaymentProcessor2 {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void processPayment() {
        // 这里可以添加支付处理的逻辑
        System.out.println("Processing payment for Order: " + order);
    }
}
