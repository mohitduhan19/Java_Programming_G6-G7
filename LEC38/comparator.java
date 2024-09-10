package LEC38;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class student {
    int rollNumber;
    String name;

    student(int rollNumber , String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public String toString(){
        return "Student[rollNumber=" + rollNumber + ", name=" + name + "]";
    }
}
class Mycomparator implements Comparator<student>{
    @Override
    public int compare(student s1, student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class comparator {
    public static void main(String[] args) {
        student[] students = {new student(2 , "john"),
        new student(1 , "alice"), new student(9 , "kira")};

        Arrays.sort(students , new Mycomparator());

        for(student s:students){
            System.out.println(s);
        }
    }
}
