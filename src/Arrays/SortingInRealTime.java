package Arrays;
    
import java.util.Scanner;

public class SortingInRealTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] arr = takeInput(size);
        int low= arr[0];
        int mid = 0;
        int high = arr.length-1;

        while (mid<=high){
            if(mid==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(mid==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                mid--;
                high--;
            }
        }
        for(int i: arr){
            System.out.println(i);
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
