package patternsAndDataTypes;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int space= N-1;
        while (currRow<=rows){

                int sp = 1;
                while(sp<=space){
                    System.out.print(" ");
                    sp++;
                }


                int st=1;
                while(st <= N){
                    if(currRow==1 || currRow==N)
                        System.out.print("*");
                    else
                        if(st==1 || st==N) System.out.print("*");
                        else System.out.print(" ");
                    st++;
                }

            space--;
            System.out.println("\n");
            currRow++;
        }
    }
}
