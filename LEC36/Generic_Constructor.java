package LEC36;

public class Generic_Constructor {
   static class GConstructor{
        private  Object value;

        public <T> GConstructor(T value){
            this.value = value;
        }
        public Object getValue(){
            return value;
        }
    }
    public static void main(String[] args) {
       GConstructor obj1 =new GConstructor(12);
       System.out.println(obj1.getValue());

       GConstructor obj2 =new GConstructor("Hello");
       System.out.println(obj2.getValue());
    }
}
