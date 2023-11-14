import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Francesco", 25);
        Student student2 = new Student("Marcello", 29);
        Student student3 = new Student("Fausto", 27);
        Student student4 = new Student("Giancarlo", 35);
        Student student5 = new Student("Gianfranco", 32);
        Student student6 = new Student("Michela", 23);
        Student student7 = new Student("Servia", 36);
        Student student8 = new Student("Tullio", 38);
        Student student9 = new Student("Miguel", 39);
        Student student10 = new Student("Cesare", 41);
        Student student11 = new Student("Valerio", 18);
        Student student12 = new Student("Fabrizio", 21);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        System.out.println(students);
        students.sort(Comparator.comparing(Student::getAge));
        System.out.println(students);
    }
}
