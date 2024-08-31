package LEC8;

public class Rotate_Image {
    public static void rotate(int[][] matrix) {

        // transpose
        for(int i = 0;i < matrix.length;i++){
            for(int j = i + 1;j < matrix[0].length;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int left = 0 , right = matrix[0].length-1;

        while(left < right){

            for(int i=0;i < matrix.length;i++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[][] nums = {{1 ,2 , 3} , {4 , 5 ,6} ,{7 , 8 ,9}};
        rotate(nums);

        for (int i = 0;i < nums.length;i++){
            for (int j = 0;j<nums[0].length;j++){
                System.out.println(nums[i][j]);
            }
        }
    }
}
