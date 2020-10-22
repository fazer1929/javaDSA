package patternsAndDataTypes;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N;
        int currRow = 1;
        int stars = 1;
        while (currRow<=rows){
            int st =  1;
            while(st<=stars){
                if(st==1 || st==currRow)    System.out.print(currRow+ "    " );
                else    System.out.print("0"+ "    " );
                st++;
            }
            stars+=1;
            System.out.println("\n");
            currRow++;
        }

    }
}
