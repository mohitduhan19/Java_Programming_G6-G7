package Lec6;

public class Array_Swap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+" "+ arr[1]);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
