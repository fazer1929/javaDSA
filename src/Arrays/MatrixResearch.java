package Arrays;

import java.util.Scanner;

public class MatrixResearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int num = scan.nextInt();
        int ans=0;
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                if(num == arr[i][j]){
                  ans=1;
                  break;
                }
            }
        }
        System.out.println(ans);
    }
}
