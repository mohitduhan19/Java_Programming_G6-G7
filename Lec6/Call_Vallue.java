package Lec6;

class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("befour swaping) "+a + " "+b);
        Swap(a,b);
        System.out.println("after swaping "+a + " "+b);
    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
