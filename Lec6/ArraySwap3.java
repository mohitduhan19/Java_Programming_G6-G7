package Lec6;

public class ArraySwap3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target[]={5,6,7,8,9};
        System.out.println(arr[0]+" "+target[1]);
        Swap(arr,target);
        System.out.println(arr[0]+" "+target[1]);
    }
    public static void Swap(int arr[],int target[]){
        int temp[]=arr;
        arr=target;
        target=temp;
        System.out.println(arr[0]+" "+target[1]);
    }
}
