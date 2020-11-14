package patternsAndDataTypes;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long n=0;
        while (num>0){
            n=n*10+(num%10);
            num=num/10;
        }
        System.out.println(n);
    }
}
