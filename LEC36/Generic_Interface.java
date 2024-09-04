package LEC36;
interface Container<T>{
    void setItem(T item);
    T getItem();
}
class Box<T> implements Container<T>{
    private T item;

    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return this.item;
    }
}
public class Generic_Interface {
    public static void main(String[] args) {
        Container<Integer> obj = new Box<>();
        obj.setItem(12);
        System.out.println(obj.getItem());

        Container<String> obj1 = new Box<>();
        obj1.setItem("Hello");
        System.out.println(obj1.getItem());
    }
}
