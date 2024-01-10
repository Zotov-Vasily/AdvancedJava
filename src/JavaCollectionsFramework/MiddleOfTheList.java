package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class MiddleOfTheList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            list1.add(new Integer(i));
        }
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list1.add(2000000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в ms) = " + (System.currentTimeMillis() - start1));


        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            list2.add(new Integer(i));
        }
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list2.add(2000000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в ms) = " + (System.currentTimeMillis() - start2));
    }
}
