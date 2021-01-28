package Arrays;

import java.util.Scanner;

public class
SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = takeInput(size);
        selectionSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr){
        int min = 0;
        for(int i =0; i<arr.length;i++){
            min=i;
            for(int j =i ;j< arr.length;j++) {
                if (arr[j] < arr[min]) min = j;
            }
            swap(arr,min,i);
        }
    }

    public static int[] takeInput(int size){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
