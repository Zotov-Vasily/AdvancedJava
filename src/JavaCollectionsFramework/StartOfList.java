package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class StartOfList {
    public static void main(String[] args) {
        getTimeMsOfInsert(new ArrayList<>());
        getTimeMsOfInsert(new LinkedList());
    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert1000000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Результат в миллисекундах: " + msDelay);
        return msDelay;
    }

    public static void insert1000000(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0, new Object());
        }
    }
}
