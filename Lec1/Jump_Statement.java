package Lec1;

public class Jump_Statement {
    public static void main(String[] args) {
//       int i=0;
//       int sum=0;
//       while (true){
//           sum=sum+i;
//           if(sum>100){
//               break;
//           }
//           System.out.println(i);
//           i++;
//       }
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
