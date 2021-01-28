package patternsAndDataTypes;

import java.util.Scanner;

public class PythagorasTriplet {
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);
        long num = scan.nextLong();
        if(num==1 || num==2){
            System.out.println("-1");
        }
        else if(num%2==0){
            System.out.println((num*num)/4 -1 + " " + (num*num)/4 + 1);
        }
        else {
            System.out.println((num*num-1)/2 + " " + (num*num +1)/2);
        }

    }
}
