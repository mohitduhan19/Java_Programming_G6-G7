package LEC44;
import java.util.*;
public class Sort_Character_By_Frequency {
    class pair implements Comparable<pair>{
        private char ch;
        private int  freq;

        public pair(char ch , int freq){
            this.ch = ch;
            this.freq = freq;
        }
        public char getCharacter(){
            return ch;
        }
        public int getfreq(){
            return freq;
        }
        public int compareTo(pair other){
            return Integer.compare(this.freq , other.freq);
        }
    }
    public String frequencySort(String s) {
        HashMap<Character ,Integer> m = new HashMap<>();

        for(int i = 0;i < s.length();i++){
            m.put(s.charAt(i) , m.getOrDefault(s.charAt(i) , 0) + 1);
        }

        List<pair> list = new ArrayList<>();
        for(char c : m.keySet()){
            list.add(new pair(c , m.get(c)));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for(int i = list.size() - 1;i >= 0;i--){
            pair p = list.get(i);
            char ch = p.getCharacter();
            int c = p.getfreq();

            for(int j = 0;j < c;j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
