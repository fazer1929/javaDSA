package patternsAndDataTypes;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i<= num /2 ;i++){
            if(num%i ==0){
                isPrime = false;
            }
        }
        System.out.println(isPrime?"Prime":"Not Prime");
    }
}
