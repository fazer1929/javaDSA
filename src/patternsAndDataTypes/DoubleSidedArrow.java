package patternsAndDataTypes;

import java.util.Scanner;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int row = N;
        int space1 = N-1;
        int space2 = -1;
        int rc=1;
        int stars=1;
        int prn=1;
        while(rc<=row){
            int sp=1;
            while(sp<=space1){
                System.out.print("  ");
                sp++;
            }

            int st=1;
            while(st<=stars){
                System.out.print((prn-st+1) +" ");
                st++;
            }

            sp =1;
            while(sp<=space2){
                System.out.print("  ");
                sp++;
            }

            if(rc!=1 && rc!=N){
                st=1;
                while(st<=stars){
                    System.out.print(st + " ");
                    st++;
                }
            }


            if(rc<=row/2){
                stars++;
                space2+=2;
                space1-=2;
                prn++;
            }
            else{
                stars--;
                space2-=2;
                space1+=2;
                prn--;
            }
            System.out.println();
            rc++;
        }
    }
}
