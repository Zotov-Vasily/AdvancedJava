package JavaCollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

class RestaurantQueue {
    private Queue<String> orders;

    public RestaurantQueue() {
        orders = new LinkedList<>();
    }

    public void takeOrder(String order) {
        orders.offer(order);
    }

    public void serveOrder() {
        while (!orders.isEmpty()) {
            String order = orders.poll();
            System.out.println("Serving order: " + order);
        }
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        RestaurantQueue restaurant = new RestaurantQueue();
        restaurant.takeOrder("Burger");
        restaurant.takeOrder("Pizza");
        restaurant.takeOrder("Salad");

        restaurant.serveOrder();
    }
}