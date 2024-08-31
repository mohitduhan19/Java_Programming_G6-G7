package Lec29;
import java.util.*;
public class boats_to_save_people {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boats=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                boats++;
            }
            else{

                j--;
                boats++;

            }

        }
        return boats;
    }
}
