package Arrays;

import java.util.Scanner;

public class ArraysTargetSumPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = scan.nextInt();
        }
        int tsum = scan.nextInt();

        for (int i = 0; i < size; i++)
        {
            for(int j = i+1; j< size; j++){
                if(arr[i]+arr[j] == tsum){
                    if(arr[i]<=arr[j]) System.out.println(arr[i] + " and " + arr[j]);
                    else System.out.println(arr[j] + " and " + arr[i]);

                }
            }

        }


    }
}
