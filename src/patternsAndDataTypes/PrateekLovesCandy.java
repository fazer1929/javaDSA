package patternsAndDataTypes;

import java.util.Scanner;

public class PrateekLovesCandy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int num =0,n=0;
        boolean prime = true;
        while (T-->0){
            num=scan.nextInt();
            for(int i = 2; ;i++){
                for(int j=2; j<=i/2;j++){
                    if(i%j==0){
                        prime=false;
                        break;
                    }
                }
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
