package LEC38;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class Remove_duplicate_from_vector {
    public static void removeDuplicates(Vector<Integer> vector){
        Set<Integer> set = new LinkedHashSet<>(vector);

        vector.clear();
        vector.addAll(set);
    }
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(10);


        System.out.println("Original vector" + vector);

        removeDuplicates(vector);

        System.out.println("vector after removal" + vector);
    }
}
