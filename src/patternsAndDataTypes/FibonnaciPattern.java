package patternsAndDataTypes;

import java.util.Scanner;

public class FibonnaciPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int prev= 0, curr =0,temp;
        int row=1;
        while(row<=N){
            int col =1;
            while(col<=row){
                System.out.print(curr + "    ");
               if(curr!=0){
                   temp = curr;
                   curr+=prev;
                   prev=temp;
               }
               else{
                   curr=1;
               }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
