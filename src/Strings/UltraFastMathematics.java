package Strings;

import java.util.Scanner;

public class UltraFastMathematics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        String s1,s2;
        while (t-->0){
            s1=scan.next();
            s2=scan.next();
            scan.nextLine();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==s2.charAt(i))
                    System.out.print(0);
                else
                    System.out.print(1);
        }
        System.out.println();

        }

    }
}
