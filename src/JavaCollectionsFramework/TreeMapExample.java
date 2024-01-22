package JavaCollectionsFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class TreeMapExample {

    private TreeMap<String, Integer> studentMap = new TreeMap<>();

    public void addSudent(String name, int grade) {
        studentMap.put(name, grade);
    }

    public String getToStudent() {
        Map.Entry<String, Integer> entry = studentMap.firstEntry();
        return entry.getKey();
    }

    public void printStudentMap() {
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        TreeMapExample example = new TreeMapExample();

        example.addSudent("Alice", 90);
        example.addSudent("Bob", 85);
        example.addSudent("Charlie", 95);

        System.out.println("Student List: ");
        example.printStudentMap();

        String topStudent = example.getToStudent();
        System.out.println("\nTop Student: " + topStudent);
    }
}


