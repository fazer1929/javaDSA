package patternsAndDataTypes;

import java.util.Scanner;

public class invertedHourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N*2+1;
        int currRow = 1;
        int space = N*2-1;
        int stars = 1;
        int number = N;
        while (currRow<=rows){
            int st =  1;
            while(st<=stars){
                System.out.print(Math.abs(number) +" ");
                number--;
                st++;
            }

            int sp = 1;
            while(sp <= space){
                System.out.print("  ");
                sp++;
                number--;
            }

            st =  1;
            while(st<=stars){
                if(st<=N)
                System.out.print(Math.abs(number) +" ");
                number--;
                st++;
            }

            if(currRow<=N){
                stars++;
                space-=2;
            }
            else {
                stars--;
                space+=2;
            }
            System.out.println("\n");
            currRow++;
            number=N;
        }
    }
}
