package Arrays;

import java.util.Scanner;

public class PrimeVisits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        boolean isPrime=true;
        int total=0;
        while(t-->0){
            int start = scan.nextInt();
            int end = scan.nextInt();
            total=0;
            for(int i = start;i<=end;i++){
                isPrime=true;
                if(i!=1){
                    for(int j = 2;j<=i/2;j++){
                        if(i%j==0){
                            isPrime=false;
                            break;
                        }

                    }
                }
                else
                    isPrime = false;

                if(isPrime){
                    total+=1;
                }

            }
            System.out.println(total);
        }

    }
}
