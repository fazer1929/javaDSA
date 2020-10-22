package patternsAndDataTypes;

import java.util.Scanner;

public class GaneshasPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int stars = 1;
        int space1 = N/2;
        while (currRow<=rows){
            int sp = 1;
            if(currRow>N/2 + 1 && currRow<N){
                while(sp<=space1) {
                    System.out.print(" ");
                    sp++;
                }
            }

            int st =  1;
            if(currRow==N/2+1 || currRow == N)
            {
                stars = N/2 + 1;
            }
            else stars = 1;

            while(st<= stars) {
                System.out.print("*");
                st++;
            }

            if(currRow!=N/2+1){
                    System.out.print("  ");
            }


            st =  1;
            if(currRow==1)
            {
                stars = N/2+1;
            }
            else if (currRow == N/2+1){
                stars=N/2;
            }
            else stars = 1;

            while(st<= stars) {
                System.out.print("*");
                st++;
            }

            System.out.println("\n");
            currRow++;
        }
    }
}
