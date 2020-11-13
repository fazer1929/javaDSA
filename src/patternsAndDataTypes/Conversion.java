package patternsAndDataTypes;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minF = scan.nextInt();
        int maxF = scan.nextInt();
        int step = scan.nextInt();
        int currF = minF;
        int C = 0;
        while(currF<=maxF){
            C= (int) ((5.0/9) * (currF - 32));
            System.out.println(currF + "    " + C);
            currF+=step;
        }
    }
}
