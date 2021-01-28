package Arrays;

import java.util.Scanner;

public class ArraySpiralPrintClockwise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               arr[i][j] = scan.nextInt();
            }
        }
//        int rows=4,cols=4;
//        int[][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int top=0,bottom=rows-1;
        int left=0,right=cols-1;
        int dir=1; //1 is Right, 2 is Down, 3 is Left, 4 is Up
        while(top<=bottom && left<=right){
            if (dir == 1) {
                for(int j = left;j<=right ; j++){
                    System.out.print(arr[top][j]+", ");
                }
                top+=1;
                dir=2;
            }else if(dir==2){
                for(int j = top;j<=bottom ; j++){
                    System.out.print(arr[j][right]+", ");
                }
                right-=1;
                dir=3;
            }
            else if(dir==3){
                for(int j = right;j>=left ; j--){
                    System.out.print(arr[bottom][j]+", ");
                }
                dir=4;
                bottom-=1;
            }
            else if(dir==4){
                for(int j = bottom;j>=top ; j--){
                    System.out.print(arr[j][left]+", ");
                }
                dir=1;
                left+=1;
            }
        }
        System.out.print("END");

    }
}
