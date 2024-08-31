package Lec7;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(5);

        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove(1);
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
