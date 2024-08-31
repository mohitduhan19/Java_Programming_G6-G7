package Lec27;
import java.util.Scanner;

public class Rotated180Anticlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Transpose(arr);
        Rotate90(arr);
        Transpose(arr);
        Rotate90(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void Rotate90(int arr[][]){
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-1][j];
                arr[arr.length-1][j]=temp;
            }
        }
    }
}
