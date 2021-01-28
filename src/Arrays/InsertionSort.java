package Arrays;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int key,j;

        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=1;i<size;i++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
