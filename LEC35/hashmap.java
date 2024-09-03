package LEC35;

public class hashmap {
    static class MyHashMap<K , V>{
        K key;
        V value;

        public MyHashMap(K key , V value){
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
        MyHashMap ipl1 = new MyHashMap("Delhi" , 0);
        MyHashMap ipl2 = new MyHashMap("Mumbai" , 5);

        MyHashMap<String , Integer> ipl3 = new MyHashMap<>("Delhi" ,0);

    }
}
