package patternsAndDataTypes;

import java.util.Scanner;

public class PrateekLovesCandy {
    public static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 ||
                n % 3 == 0)
            return false;

        for (int i = 5;
             i * i <= n; i = i + 6)
            if (n % i == 0 ||
                    n % (i + 2) == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int num =0,n=0;
        boolean prime = true;
        while (T-->0){
            num=scan.nextInt();
            for(int i = 2; ;i++){
                prime= isPrime(i);
                if(prime){
                    n++;
                    if(n==num){
                        System.out.println(i);
                        break;
                    }
                }
                prime=true;
            }
            num=0;
            n=0;

        }
    }
}
