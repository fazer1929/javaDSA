package patternsAndDataTypes;
import java.util.Scanner;
public class hourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int rows = N*2-1;
        int currRow = 1;
        int space = 0;
        int stars = 2*N - 1;
        while (currRow<=rows){
            int sp = 1;
            while(sp <= space){
                System.out.print(" ");
                sp++;
            }
            int st =  1;
            while(st<=stars){
                System.out.print("*");
                st++;
            }
            if(currRow<N){
                stars-=2;
                space++;
            }
            else {
                stars+=2;
                space--;
            }
            System.out.println("\n");
            currRow++;
        }
    }
}
