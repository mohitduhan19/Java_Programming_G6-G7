package Lec26;

public class string_compression {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int cnt = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
            } else {
                if (cnt > 1) {
                    sb.append(cnt);
                }
                sb.append(chars[i]);
                cnt = 1;
            }
        }

        if (cnt > 1) {
            sb.append(cnt);
        }
        for(int j = 0 ; j < sb.length() ; j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'a' , 'b' , 'b' ,'c' ,'c' ,'c'};
        System.out.println(compress(ch));
    }
}
