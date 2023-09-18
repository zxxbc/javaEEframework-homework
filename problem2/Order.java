public class Order {
    private int orderId;
    private double totalAmount;

    public Order(int orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order [订单编号为=" + orderId + ", 总金额=" + totalAmount + "]";
    }
}
