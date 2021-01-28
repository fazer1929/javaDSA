package Arrays;

import java.util.Scanner;

public class FindLowerAndUpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size;i++){
                arr[i] = scan.nextInt();
        }

        int Q = scan.nextInt();
        int[] query = new int[Q];

        for(int i=0; i<Q;i++){
            query[i] = scan.nextInt();
        }
        int q = 0;
        int l,u,m,lower,upper,num;
        int diff;

        while(q<Q){
            num = query[q];
            lower=-1;
            upper=-1;
            l=0;
            u=size-1;
            while (l<=u){
                m=l+(u-l)/2;
                if(arr[m] == num){
                    lower=m;
                    upper=m;
                    diff=1;
                    while(arr[m-diff]==num){
                        lower=m-diff;
                        diff+=1;
                    }
                    diff=1;
                    while(arr[m+diff]==num){
                        upper=m+diff;
                        diff+=1;
                    }
                    break;
                }
                if(arr[m]<num){
                    l=m+1;
                }
                else{
                    u=m-1;
                }
            }
            System.out.println(lower + " "+ upper);
            q++;
        }

    }
}
