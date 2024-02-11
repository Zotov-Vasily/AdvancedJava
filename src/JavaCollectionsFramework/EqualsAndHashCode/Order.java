package JavaCollectionsFramework.EqualsAndHashCode;

import java.util.Objects;

public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    public int hashCode() {
        return Objects.hash(orderId);
    }

    public static void main(String[] args) {
        // Создаем несколько заказов
        Order order1 = new Order(1, "John", 50.0);
        Order order2 = new Order(1, "Jane", 60.0);
        Order order3 = new Order(2, "John", 50.0);

        // Выводим результаты сравнения
        System.out.println("Order 1 equals Order 2: " + order1.equals(order2));
        System.out.println("Order 1 equals Order 3: " + order1.equals(order3));

        // Выводим хэш-коды заказов
        System.out.println("Hash code for Order 1: " + order1.hashCode());
        System.out.println("Hash code for Order 2: " + order2.hashCode());
    }
}

