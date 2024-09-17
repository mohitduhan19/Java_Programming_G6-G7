package LEC43;

public class Valid_Palindrome_2 {
    public boolean remove(String s , int i , int j){
        while(i <= j){
            if(s.charAt(i ) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0 , j =s.length()-1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return remove(s , i + 1 , j) || remove(s ,i , j - 1);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
