package Strings;

import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[256];
        String str = scan.nextLine();
        int max=0;
        for(int i=0;i<255;i++)
            arr[i]=0;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
            if(arr[str.charAt(i)]>arr[max]){
                max=str.charAt(i);
            }
        }
        System.out.print((char)max);
    }
}
