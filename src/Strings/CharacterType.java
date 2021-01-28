package Strings;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.nextLine().charAt(0);
        char ans;
        if(ch>='A' && ch<='Z')
            System.out.println("UPPERCASE");
        else if(ch>='a' && ch<='z')
            System.out.println("lowercase");
        else
            System.out.println("Invalid");
        StringBuilder s;
        

    }
}
