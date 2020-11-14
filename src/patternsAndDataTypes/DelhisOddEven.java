package patternsAndDataTypes;

import java.util.Scanner;

public class DelhisOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int num =0;
        int odd = 0;
        int even = 0;
        while (T-->0){

            num = scan.nextInt();
            while(num>0){
                if((num%10)%2==0) even+=num%10;
                else odd+=num%10;
                num/=10;
            }
            if(even%4==0) System.out.println("Yes");
            else if(odd%3==0) System.out.println("Yes");
            else System.out.println("No");
            odd=0;
            even=0;
            num=0;
        }
    }
}
