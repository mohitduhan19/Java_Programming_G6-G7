package Lec29;

public class Happy_number {
    int move(int n){
        int new_number=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            new_number+=digit*digit;
        }
        return new_number;
    }
    public boolean isHappy(int n) {
        if(n==1) return true;
        int slow=n;
        int fast=move(n);
        while(slow!=fast){
            if(slow==1 || fast==1){
                return true;
            }
            slow=move(slow);
            fast=move(move(fast));
        }
        return false;

    }
}
