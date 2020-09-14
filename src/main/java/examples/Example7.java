package examples;

import java.util.LinkedList;
import java.util.List;

class Student {
    String name;
    String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class StudentsRepository {

    private List<Student> students = new LinkedList<Student>();

    public void StudentsRepository() {
        students.add(new Student("Adam", "Kowalsky"));
        students.add(new Student("Martha", "Brown"));
    }

    public int getSize() {
        return students.size();
    }

}

public class Example7 {

    public static void main(String[] args) {
        StudentsRepository studentsRepository = new StudentsRepository();
        System.out.println(studentsRepository.getSize());
    }

}
