package Strings;

import java.util.Scanner;

public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder s2;
        if(str.length()%2==0)
            s2 = new StringBuilder(str.substring(str.length()/2));
        else
            s2 = new StringBuilder(str.substring(str.length()/2 + 1));
        System.out.println(str.substring(0,str.length()/2).equals(s2.reverse().toString()));

    }
}
