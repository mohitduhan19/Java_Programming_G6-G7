package Lec28;

public class container_with_most_water {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int maxi=0;
        while(i<j){
            if(arr[i]>=arr[j]){
                maxi=Math.max(maxi,(arr[j])*(j-i));
                j--;
            }
            else{
                maxi=Math.max(maxi,(arr[i])*(j-i));
                i++;

            }

        }
        return maxi;

    }
}
