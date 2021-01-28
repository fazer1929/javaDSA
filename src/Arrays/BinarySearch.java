package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = scan.nextInt();
        }
        int search = scan.nextInt();
        int low =0,high = size-1,mid=-1,ans=-1;

        while(low<=high){
            mid = low+ (high-low)/2;
            if(search == arr[mid]){
                ans=mid;
                break;
            }else if(arr[mid]>search){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);

    }



}
