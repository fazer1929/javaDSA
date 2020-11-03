package patternsAndDataTypes;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0 ;
        int num;
        num=scan.nextInt();
        while(sum>=0){
            System.out.println(num);
            num=scan.nextInt();
            sum+=num;

        }
    }
}
