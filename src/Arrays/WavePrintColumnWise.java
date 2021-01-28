package Arrays;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int num = 0;
        for(int i=0;i<n;i++){
            num=0;
            while(num<m){
                System.out.print(arr[num][i] +", ");
                num++;
            }
            i++;
            num=0;
            while(num<m){
                System.out.print(arr[m-num-1][i] +", ");
                num++;
            }
        }
        System.out.println("END");


    }
}
