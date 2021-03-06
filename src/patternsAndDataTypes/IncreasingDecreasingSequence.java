package patternsAndDataTypes;

import java.util.Scanner;

public class IncreasingDecreasingSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int prevNum = Integer.MIN_VALUE, currNum;
        int num=1;
        boolean incr=true,decr=true,isDecreasing = true;

        while(num<=N){
            currNum = scan.nextInt();

            if(isDecreasing){
                if(currNum<prevNum)
                    isDecreasing = false;
            }
            else{
                if(currNum>prevNum)
                    incr=false;
            }

            num++;
            prevNum= currNum;

        }
        if(incr && decr)
            System.out.println("true");
        else
            System.out.println("false");
    }
}


