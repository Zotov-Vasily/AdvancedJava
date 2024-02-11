package JavaCollectionsFramework.EqualsAndHashCode;

public class OrderTest {
    public static void main(String[] args) {
        testEquals();
        testHashCode();
    }

    public static void testEquals() {
        Order order1 = new Order(1, "John", 50.0);
        Order order2 = new Order(1, "Jane", 60.0);
        Order order3 = new Order(2, "John", 50.0);

        // Проверка на равенство двух заказов с одинаковым orderId
        boolean equalsTest1 = order1.equals(order2);
        System.out.println("Order 1 equals Order 2: " + equalsTest1);

        // Проверка на неравенство двух заказов с разными orderId
        boolean equalsTest2 = !order1.equals(order3);
        System.out.println("Order 1 equals Order 3: " + equalsTest2);
    }

    public static void testHashCode() {
        Order order1 = new Order(1, "John", 50.0);
        Order order2 = new Order(1, "Jane", 60.0);

        // Проверка на равенство хэш-кодов у двух заказов с одинаковым orderId
        boolean hashCodeTest = order1.hashCode() == order2.hashCode();
        System.out.println("Hash code для Order 1 equals hash code для Order 2: " + hashCodeTest);
    }
}

