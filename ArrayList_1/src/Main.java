import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String [] args){
        Student student1 = new Student("Francesco" , 25);
        Student student2 = new Student("Marcello" , 29);
        Student student3 = new Student("Fausto" , 27);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Student student4 = new Student("Giancarlo",35);
        Student student5 = new Student("Gianfranco",32);
        Student student6 = new Student("Michela",23);
        Student student7 = new Student("Orlando",33);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        System.out.println(students);

    }
}
