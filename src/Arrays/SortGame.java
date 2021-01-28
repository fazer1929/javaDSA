package Arrays;

import java.util.Scanner;

public class SortGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x =scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[N];

        String[] str = new String[N];
        for(int i=0;i<N;i++){
            str[i] = scan.next();
            arr[i] = scan.nextInt();
        }
        int max,temp;
        String tempStr;
        for (int i = 0;i<N;i++){
            max=i;
            for(int j =i+1;j<N;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }else if(arr[max]==arr[j]){
                    if(str[max].charAt(0) < str[j].charAt(0)){
                        max=j;
                    }
                }
            }
            tempStr=str[i];
            temp = arr[i];
            str[i] = str[max];
            arr[i] = arr[max];
            str[max] =tempStr;
            arr[max] = temp;
        }

        for(int i=0;i<N;i++){
            if(arr[i]>=x){
                System.out.println(str[i] +" " + arr[i]);
            }
        }
    }
}
