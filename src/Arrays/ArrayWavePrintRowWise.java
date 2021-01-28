package Arrays;

import java.util.Scanner;

public class ArrayWavePrintRowWise {
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

        for(int i=0; i<rows;i++){
            if(i%2==0){
                for(int j=0;j<cols;j++) System.out.print(arr[i][j] + ", ");
            }
            else{
                for(int j=cols-1;j>=0;j--) System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.print("END");

    }
}
