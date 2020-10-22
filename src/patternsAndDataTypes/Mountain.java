package patternsAndDataTypes;

import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int space = N*2 - 3;
        int stars = 1;
        while (currRow<=rows){
            int st =  1;
            while(st<=stars){
                System.out.print(st+ "    " );
                st++;
            }

            int sp = 1;
            while(sp <= space){
                System.out.print("     ");
                sp++;
            }
            if(currRow ==N)
                st=2;
            else
                st =  1;
            while(st<=stars){
                    System.out.print((stars-st+1) + "    ");
                st++;
            }
                stars++;
                space-=2;

            System.out.println("\n");
            currRow++;
        }
    }
}
