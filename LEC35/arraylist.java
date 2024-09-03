package LEC35;

import java.util.ArrayList;

public class arraylist {
    static class MyArrayList {
        private int[] data = new int[10];
        private int capacity = 10;
        private int size = 0;

        public int get(int idx) {
            return data[idx];
        }

        public void set(int val, int idx) {
            data[idx] = val;
        }

        public void add(int val) {
            if (size == capacity) {
                capacity = capacity + capacity / 2;
                int[] copy = new int[capacity];
                for (int idx = 0; idx < data.length; idx++) {
                    copy[idx] = data[idx];
                }
                data = copy;
            }
            data[size] = val;
            size++;
        }

        public int remove() {
            int oldValue = data[size];
            data[size] = 0;
            size--;
            return oldValue;
        }

        public String toString(){
           StringBuilder res =new StringBuilder("[");
            for(int val : data){
                res.append(val + ",");
            }
           res.setCharAt(res.length()-1 , ']');
            return res.toString();
        }
       }
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(10);
            arr.add(20);
            //  System.out.println(arr);


            MyArrayList list = new MyArrayList();
            list.add(10);
            list.add(20);
            System.out.println(list);
        }
    }