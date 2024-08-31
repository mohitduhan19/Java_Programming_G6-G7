package Lec30;

public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public int minimumLength(String s) {
        int left=0,right=s.length()-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
            char ch=s.charAt(left);
            while(left<=right && s.charAt(left)==ch){
                left++;
            }
            while(right>=left && s.charAt(right)==ch){
                right--;
            }
        }
        return right-left+1;
    }
}
