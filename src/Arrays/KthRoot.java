package Arrays;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long k = scan.nextInt();
        long x;
        System.out.print(Math.floor(Math.pow(n,1.0/k)));

    }
}
