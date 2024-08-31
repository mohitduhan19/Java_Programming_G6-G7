package LEC8;
import java.util.*;
public class Spiral_Print {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int frow = 0, fcol =0 ,lrow = row - 1,lcol = col-1;
        int count = 0;

        if(matrix.length == 0)return res;

        while(count < row*col){
            for(int j = fcol; j<= lcol;j++){

                res.add(matrix[frow][j]);
                count++;
                if(count ==row*col){
                    break;
                }
            }
            frow++;

            for(int i = frow ; i<= lrow;i++){

                res.add(matrix[i][lcol]);
                count++;
                if(count == row*col){
                    break;
                }
            }
            lcol--;
            if(frow <= lrow){

                for(int j = lcol ; j>= fcol;j--){

                    res.add(matrix[lrow][j]);
                    count++;
                    if(count ==row*col){
                        break;
                    }
                }
            }
            lrow--;
            if(fcol <= lcol){
                for(int i = lrow ; i>=frow;i--){

                    res.add(matrix[i][fcol]);
                    count++;
                    if(count == row*col){
                        break;
                    }
                }
            }
            fcol++;
        }
        return res;

    }
    public static void main(String[] args) {
        int[][] nums= {{1,2,3} , {4 , 5 , 6} ,{7 , 8 ,9}};
        List<Integer> ans = spiralOrder(nums);
        for(int i= 0;i < ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
