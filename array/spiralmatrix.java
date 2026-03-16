package  array;

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5] */


import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        
 
        int n=sn.nextInt();
        int [][]matrix=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sn.nextInt();
            }
        }
 int top=0;
 int bottom=n-1;
 int left=0;
 int right=n-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
          
        }


    }
}
