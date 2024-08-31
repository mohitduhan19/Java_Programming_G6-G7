package Lec26;

public class Valid_Palindrome2 {
   static boolean remove(String s,int i ,int j){
        while(i<=j){
            if ( s.charAt(i)!=s.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                //below condition check to remove char or not
                return remove(s,i+1,j) || remove(s,i,j-1);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
}
