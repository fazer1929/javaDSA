package patternsAndDataTypes;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long binary = scan.nextLong();
        long bin = binary;
        int decimal =0;
        int pow=0;
        while (bin>0){
            decimal+= Math.pow(2,pow) * (bin%10);
            bin=bin/10;
            pow++;
        }
        System.out.println(decimal);
    }
}
