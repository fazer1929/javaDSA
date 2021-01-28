package Strings;

import java.util.Scanner;

public class BracketsAllOver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        int open = 0,close=0,ans=0;
        int left=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
                open++;
        }
        close=str.length()-open;
        if(n-m >= open-close){
            if(((n-m)%2==0 && (open-close)%2==0) || ((n-m)%2!=0 && (open-close)%2!=0)){
                ans++;
                left= (n-m) - (open-close);
                ans+=left/2;
            }
        }
        System.out.println(ans);
    }
}