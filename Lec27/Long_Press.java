package Lec27;

public class Long_Press {
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length())return false;

        int i = 0, j = 0;
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;j++;
            }else{
                if(i > 0 && name.charAt(i - 1) == typed.charAt(j)){
                    j++;
                }else{
                    return false;
                }
            }
        }
        while(j < typed.length()){
            if(name.charAt(i - 1) != typed.charAt(j))return false;
            j++;
        }

        return i < name.length()?false:true;
    }

    public static void main(String[] args) {
        String  a = "alex";
        String  b = "aaleex";
        System.out.println(isLongPressedName(a , b));
    }
}
