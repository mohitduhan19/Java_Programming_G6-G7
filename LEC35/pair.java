package LEC35;

import java.util.ArrayList;
import java.util.HashMap;

public class pair {


    static class Pair<K extends Number, V>{
        K key;
        V value;

        public Pair(K key , V value){
            this.key=key;
            this.value=value;
        }

        public K getKey(){
            return key;
        }
        public void setKey(K key){
            this.key= key;
        }
        public V getValue(){
            return value;
        }
        public void setValue(V value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Pair<Integer , Object> obj1 = new Pair(5 , new ArrayList<>());
        Pair<Integer , Object> obj2 = new Pair<>(10, new HashMap<>());
    }
}
