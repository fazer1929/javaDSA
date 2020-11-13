package patternsAndDataTypes;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N1= scan.nextInt();
        int N2 = scan.nextInt();
        int num = 1,n=1;
        while (num<=N1){
            if((3*n +2)%N2 !=0){
                System.out.println((3*n +2));
                num++;
            }
            n++;
        }
    }
}
