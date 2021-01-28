package Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
        }
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=scan.nextInt();
        }
        int max,carry=0;
        int[] arr3;
        if(n>m) {
            max=n;
        }
        else {
            max=m;
        }
        arr3 = new int[max];

        while(n>0 && m>0){
            n--;m--;max--;
            arr3[max] = (arr1[n] + arr2[m] + carry)%10;
            carry=(arr1[n] + arr2[m] +carry)/10;
        }
        while(n>0){
            n--;max--;
            arr3[max]=(arr1[n]+carry)%10;
            carry = (arr1[n] +carry)/10;
        }
        while(m-->0){
            m--;max--;
            arr3[max]=(arr2[n]+carry)%10;
            carry = (arr2[n] +carry)/10;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i] + ", ");
        }
        System.out.println("END");
    }
}
