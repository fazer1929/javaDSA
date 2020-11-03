package patternsAndDataTypes;

import java.util.Scanner;

public class VonNeumannLovesBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases= scan.nextInt();
        int num,numInDec,count;
        while (testCases-- > 0){
            count=0;
            numInDec=0;
            num=scan.nextInt();
            while(num!=0){
                numInDec+= (num%10)*Math.pow(2,count);
                count++;
                num=num/10;
            }
            System.out.println(numInDec);
        }
    }

}
