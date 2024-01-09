package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {
    public static void processArrayList(ArrayList<String> stringList) {
        stringList.removeIf(s -> s.contains("a"));
        stringList.add("NewElement");
        System.out.println("Processed ArrayList: " + stringList);
    }

    public static void processLinkedList(List<Integer> intList) {
        intList.replaceAll(n -> n * 2);
        intList.subList(0, 3).clear();
        System.out.println("Processed LinkedList: " + intList);
    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("apple");
        stringArrayList.add("banana");
        stringArrayList.add("orange");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);

        processArrayList(stringArrayList);
        processLinkedList(integerLinkedList);
    }
}
