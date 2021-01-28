package Arrays;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int max =Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int[] arr2 = new int[max+1];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = 0;
        }
        for(int i=0;i<size;i++){
            arr2[arr[i]]++;
        }
        int m = 0;
        for(int i=0;i<arr2.length;i++){
            m=0;
            if(arr2[i]>0)
                while(m<arr2[i]){
                    System.out.print(i+" ");
                    m++;
                }
        }

    }
}
