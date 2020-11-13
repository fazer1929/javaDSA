package patternsAndDataTypes;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long N = num;
        long ans = 0,quot=9;

        while(quot>=8){
            quot = N/8;
            ans= ans*10+(N%8);
            N=quot;
        }
        ans = ans*10 + N;

        StringBuilder s = new StringBuilder();
        s.append(ans);
        s = s.reverse();
        System.out.println(s);
    }
}
