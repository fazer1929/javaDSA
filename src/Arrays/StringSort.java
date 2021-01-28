package Arrays;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = scan.next();
        }

        int min;
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].charAt(0) < arr[min_idx].charAt(0))
                    min_idx = j;
                else if(arr[j].charAt(0) == arr[min_idx].charAt(0))
                    if(arr[j].length()>arr[min_idx].length())
                        min_idx=j;

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for(String i: arr){
            System.out.println(i);
        }

    }
}
