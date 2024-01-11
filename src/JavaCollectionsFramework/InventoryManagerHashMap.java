package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagerHashMap {
    private Map<String, Integer> inventory;

    public InventoryManagerHashMap() {
        inventory = new HashMap<>();
    }

    public void addToInventory(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
        }else {
            inventory.put(String.valueOf(itemName), quantity);
        }
    }
    public void sellItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);

            if (currentQuantity >= quantity) {
                inventory.put(itemName, currentQuantity - quantity);
            }else {
                inventory.put(itemName, 0);
                System.out.println("Продажа не удалась. Недостаточное количество товара.");
            }
        }else {
            System.out.println("Продажа не удалась. Товар не найден в инвентаре.");
        }
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public static void main(String[] args) {
        InventoryManagerHashMap manager = new InventoryManagerHashMap();

        manager.addToInventory("Футболка", 50);
        manager.addToInventory("Джинсы", 30);
        manager.addToInventory("Обувь", 20);

        manager.sellItem("Футболка", 10);
        manager.sellItem("Джинсы", 5);

        System.out.println("Текущий инвентарь:");
        Map<String, Integer> currentInventory = manager.getInventory();
        for (Map.Entry<String, Integer> entry : currentInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " шт.");
        }
    }
}


