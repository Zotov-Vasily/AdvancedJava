package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        // Сравниваем студентов по их среднему баллу
        // Учитываем случай, когда средние баллы совпадают
        return Double.compare(o.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // Сравниваем студентов по их среднему баллу
        // Учитываем случай, когда средние баллы совпадают
        return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }
}

public class StudentSorting {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 4.2));
        students.add(new Student("Bob", 3.8));
        students.add(new Student("Charlie", 4.5));
        students.add(new Student("David", 4.0));


        System.out.println("Список студентов до сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка с использованием Comparable
        Collections.sort(students);

        System.out.println("\nСписок студентов после сортировки (по среднему баллу):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка с использованием Comparator
        Collections.sort(students, new GradeComparator());

        System.out.println("\nСписок студентов после сортировки (с использованием Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
