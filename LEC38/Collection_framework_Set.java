package LEC38;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_framework_Set {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(10);
        s1.add(40);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(10);

        Set<Integer> s3 = new TreeSet<>();
        s3.add(10);
        s3.add(20);
        s3.add(50);
        s3.add(40);

        for(Integer a: s1){
            System.out.println(a + " ");
            System.out.println();
        }
        for(Integer a: s2){
            System.out.println(a + " ");
            System.out.println();
        }
        for(Integer a : s3){
            System.out.println(a+ " ");
            System.out.println();
        }
    }
}
