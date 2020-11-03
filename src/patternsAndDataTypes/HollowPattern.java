package patternsAndDataTypes;

import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int stars = N/2 + 1;
        int space=1;
        while (currRow<=rows){
            int st =  1;
            while(st<=stars){
                System.out.print("*    ");
                st++;
            }
            if(currRow!=1 && currRow!=N){
                int sp = 1;
                while(sp<=space){
                    System.out.print("     ");
                    sp++;
                }
            }
            st =  1;
            if(currRow == 1 || currRow == N) st=2;
            while(st<=stars){
                System.out.print("*    ");
                st++;
            }
            if(currRow<= N/2){
                stars-=1;
                if(currRow>1) space+=2;
            }
            else{
                stars++;
                space-=2;
            }
            System.out.println("\n");
            currRow++;
        }
    }
}
