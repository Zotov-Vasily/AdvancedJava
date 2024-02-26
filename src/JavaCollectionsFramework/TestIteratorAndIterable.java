package JavaCollectionsFramework;

import java.util.Iterator;

// Класс Schoolboy для представления информации о школьниках
class Schoolboy {
    String name;
    int age;

    public Schoolboy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Класс SchoolboyList для представления списка школьников и его итерации
class SchoolboyList implements Iterable<Schoolboy> {
    private Schoolboy[] schoolboys;
    private int size;
    private int capacity;

    public SchoolboyList() {
        capacity = 10; // Начальная емкость списка
        schoolboys = new Schoolboy[capacity];
        size = 0;
    }

    public void addSchoolboy(Schoolboy schoolboy) {
        if (size == capacity) {
            // Увеличиваем емкость массива вдвое при достижении предела
            capacity *= 2;
            Schoolboy[] newSchoolboys = new Schoolboy[capacity];
            System.arraycopy(schoolboys, 0, newSchoolboys, 0, size);
            schoolboys = newSchoolboys;
        }
        schoolboys[size++] = schoolboy;
    }

    public Iterator<Schoolboy> iterator() {
        return new SchoolboyIterator();
    }
    // Вложенный класс StudentIterator для итерации по списку студентов
    private class SchoolboyIterator implements Iterator<Schoolboy> {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < size;
        }

        public Schoolboy next() {
            if (!hasNext()) {
                try {
                    throw new NoSuchFieldException();
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            }
            return schoolboys[currentIndex++];
        }
    }
}

public class TestIteratorAndIterable {
    public static void main(String[] args) {
        SchoolboyList schoolboys = new SchoolboyList();
        schoolboys.addSchoolboy(new Schoolboy("Alice", 20));
        schoolboys.addSchoolboy(new Schoolboy("Bob", 22));
        schoolboys.addSchoolboy(new Schoolboy("Carol", 21));

        // Используем цикл for-each для итерации по списку студентов
        for (Schoolboy schoolboy : schoolboys) {
            System.out.println("Name: " + schoolboy.getName() + ", Age: " + schoolboy.getAge());
        }

    }
}
