package patternsAndDataTypes;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int space = N - 1;
        int stars = 1;
        int printVal = 1;
        int currCol = 1;
        while (currRow<=rows){
            currCol=1;
            printVal=currRow;
            int sp = 1;
            while(sp <= space){
                System.out.print("     ");
                sp++;
                currCol++;
            }

            int st =  1;
            while(st<=stars){
                System.out.print(printVal+ "    " );
                st++;
                if(currCol<N) printVal++;
                else printVal --;

                currCol++;
            }

            stars+=2;
            space-=1;

            System.out.println("\n");
            currRow++;
        }

    }
}
