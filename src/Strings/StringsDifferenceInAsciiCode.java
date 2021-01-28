package Strings;

import java.util.Scanner;

public class StringsDifferenceInAsciiCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num;
        StringBuilder ss =new StringBuilder(str);
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++){
            num = (int)str.charAt(i)-str.charAt(i-1);
            System.out.print(num);
            System.out.print(str.charAt(i));
        }
    }

}
