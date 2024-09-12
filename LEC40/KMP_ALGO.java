package LEC40;

public class KMP_ALGO {
    public int[] computeToCompareArray(char[] pattern){
        int[] lps = new int[pattern.length];
        int idx = 0;

        for(int i = 1;i < pattern.length;){
            if(pattern[i] == pattern[idx]){
                lps[i] = idx + 1;
                idx++;
                i++;
            }else{
                if(idx != 0){
                    idx = lps[idx-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int KMP(char[] text , char[] pattern){
        int[] lps = computeToCompareArray(pattern);

        int i = 0;
        int j = 0;

        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length){
            return (i-pattern.length);
        }
        return -1;
    }
    public int strStr(String haystack, String needle) {
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        return KMP(a , b);
    }
}
