import java.io.Serializable;

public class Student implements Serializable{
 int id;
 String name;
 public Student(String name, int id) {
  this.id = id;
  this.name = name;
 }
}