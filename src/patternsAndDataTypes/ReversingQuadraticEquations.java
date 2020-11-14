package patternsAndDataTypes;

import java.util.Scanner;

public class ReversingQuadraticEquations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        float D = b*b - 4*a*c;
        if(D<0){
            System.out.println("Imaginary");
        }
        else if(D>0){
            System.out.println("Real and Distinct");
            int x2 = (int)(-b+ Math.sqrt(D))/(2*a);
            int x1 = (int)(-b - Math.sqrt(D))/(2*a);
            System.out.println(x1+" " + x2);
        }
        else{
            System.out.println("Real and Equal");
            int x1 = (int)(-b+ Math.sqrt(D))/(2*a);
            System.out.println(x1+" " + x1);
        }
    }
}
