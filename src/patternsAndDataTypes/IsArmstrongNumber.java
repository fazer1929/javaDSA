package patternsAndDataTypes;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long n = num;

        int digits = (int)Math.ceil(Math.log10(num));
        while(num>0){
            n -= Math.pow(num%10,digits);
            num=num/10;
        }
        System.out.println(n==0);
    }
}
