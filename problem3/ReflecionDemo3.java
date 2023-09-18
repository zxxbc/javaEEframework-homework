public class ReflecionDemo3 {
    public static void main(String[] args) {
        Order order = new Order(123, 100.0);   // 创建订单
        PaymentProcessor2 paymentProcessor = new PaymentProcessor2();// 创建 支付对象
        paymentProcessor.setOrder(order);   // 使用setter方法注入Order对象

        paymentProcessor.processPayment();
    }
}
