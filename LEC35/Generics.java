package LEC35;

import java.util.ArrayList;

public class Generics {
    public void object(){
        Object[] arr = new Object[5];

        //arr[0] = new Integer(10);
        arr[0] = 10;

        arr[1] = new StringBuilder("Hello");
        arr[2] = 'A';
        if(arr[1] instanceof StringBuilder){
            ((StringBuilder)arr[1]).append("World");
        }
        if(arr[0] instanceof StringBuilder) {
            ((StringBuilder) arr[0]).append("World");
        }
        for(int i = 0;i < 5;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ArrayList list1 = new ArrayList();
        list1.add(12);
        list1.add("Hello");
        list1.add(10.5);

        ((StringBuilder)list1.get(1)).append("World");

    }
}
