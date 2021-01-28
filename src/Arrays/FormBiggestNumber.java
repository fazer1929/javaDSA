package Arrays;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        int size;
        int[] arr;
        int temp;
        while(t-->0){
            size = scan.nextInt();
            arr = new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = scan.nextInt();
            }
            for(int i=0;i<size;i++){
                for(int j =0;j<size-i-1;j++){
                    if(!comp(arr[j],arr[j+1]))
                    {
                        temp=arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j]=temp;
                    }
                }
                }
            for(int i = 0;i<size;i++){
                 System.out.print(arr[i]);
            }
            System.out.println();

            }
        }
        public static boolean comp(int a,int b){
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        if(ab.compareTo(ba)>=0)
            return true;
        else
            return false;

    }

}
