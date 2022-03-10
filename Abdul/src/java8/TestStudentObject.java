package java8;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class TestStudentObject {
 
    public static void main(String[] args) {
 
        // create a list of Student objects
        List<Student> studentList = new ArrayList<>();
 
        // add student object to List
        studentList.add(new Student(1,"Arun", 67.36, 2));
        studentList.add(new Student(2,"Sethu", 88.58, 1));
        studentList.add(new Student(3,"Ajith", 55.74, 4));
        studentList.add(new Student(4,"Vikcy", 61.32, 3));
        studentList.add(new Student(1,"Arun", 67.36, 2)); // duplicate Arun
        studentList.add(new Student(4,"Vikcy", 61.32, 3)); // duplicate Vicky
 
        // pretty print
        System.out.println("1. Original Student list with duplicates :\n");
        studentList.forEach(student -> System.out.println(student));
 
        // Java 8 - Collector.toCollection()
        Set<Student> uniqueStudentSet = studentList
                .stream() // get stream for original list
                .distinct() // removes duplicate
                .collect(Collectors.toSet()); 
 
        // pretty print
        System.out.println("\n2. New SET with unique Student objects"
                + " in natural order of Id :\n");
        uniqueStudentSet.forEach(uniqueStudent -> System.out.println(uniqueStudent));
    }
}
