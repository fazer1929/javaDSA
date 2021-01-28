package patternsAndDataTypes;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 1 ;i <=N ; i++){
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num+"    ");
                num = num * (i-j)/j;
            }
            System.out.println();
        }
    }
}
