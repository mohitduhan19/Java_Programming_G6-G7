package LEC38;

import java.lang.reflect.Array;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int rollNumber;
    String name;

    Student(int rollNumber , String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rollNumber - s.rollNumber;
    }
    public String toString(){
        return "Student[rollNumber=" + rollNumber + ", name=" + name + "]";
    }
}
public class comparable {
    public static void main(String[] args) {
        Student[] students = {new Student(2 , "john") , new Student(1 , "Alice"),
                new Student(5 ,"Kira")};
        Arrays.sort(students);

        for(Student a:students){
            System.out.println(a);
        }
    }
}