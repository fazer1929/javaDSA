package Arrays;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        int[] arr = null;
        int[] sumarr = null;
        int sum;
        while(t-- > 0){
            int size = scan.nextInt();
            sum=0;
            arr = new int[size];
            sumarr = new int[size];
            int max =Integer.MIN_VALUE;
            for(int i=0 ; i<size ; i++){
                sumarr[i]=0;
                arr[i]= scan.nextInt();
                sum+=arr[i];
                sumarr[i]= sum;
            }
            for(int i=0;i<size;i++){
                for(int j =0 ;j<size;j++){
                    if(max < sumarr[j]-arr[i])
                        max = sumarr[j] - arr[i];
                }
            }

            System.out.println(max);
        }

}
    }
