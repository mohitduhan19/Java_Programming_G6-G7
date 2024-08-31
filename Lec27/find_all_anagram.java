package Lec27;
import java.util.*;
public class find_all_anagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int[] req = new int[26];
        int c = 0;
        for(int i=0;i<p.length();i++){
            req[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            String temp = s.substring(i,p.length()+i);
            int[] curr = new int[26];
            for(int j=0;j<p.length();j++){
                curr[temp.charAt(j)-'a']++;
            }
            if(Arrays.equals(req,curr)){
                list.add(i);
                c++;
            }

        }
        System.out.print(c);
        return list;
    }

    public static void main(String[] args) {
        String a = "cbaebabacd";
        String b = "abc";

       List<Integer> ans = findAnagrams(a , b);
       for(int i = 0;i < ans.size();i++){
           System.out.println(ans.get(i));
       }
    }
}
