package LEC35;

public class Generics1 {
   static class Box<T>{
        private T data;
        public Box(T data){
            this.data=data;
        }
        public T getData(){
            return data;
        }
        public void setData(T data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        Box<Integer> obj = new Box<>(5);
        System.out.println(obj.getData());

        Box<String> obj1 = new Box<>("Hello");
        System.out.println(obj1.getData());

        Box obj3 = new Box(4.5);
        System.out.println(obj3.getData());

        Box obj4 = new Box(new StringBuilder("Hello"));
        System.out.println(obj4.getData());

    }
}
