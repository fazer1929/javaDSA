package Arrays;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        Scanner scan = new Scanner(System.in);
        int rotation= scan.nextInt();
        int rot = rotation%arr.length;
        if(rot<0){
            rot+=6;
        }

        for(int j = 1;j<=rot;j++){
            int temp = arr[arr.length - 1];
            for(int i = arr.length-1;i>=1;i--){
                arr[i]=arr[i-1];
            }
            arr[0] = temp;
        }

        for(int val: arr){
            System.out.print(val + " ");
        }

    }
}
