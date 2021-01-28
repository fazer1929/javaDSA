package Strings;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,M,K,S;
        N = scan.nextInt();
        M = scan.nextInt();
        K = scan.nextInt();
        S = scan.nextInt();
        scan.nextLine();
        boolean canEscape = true;

        String[] str = new String[M];

        for(int i=0;i<M;i++){
            str[i] =scan.nextLine();
        }
//        S++;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j+=2){
                S--;

                if(str[i].charAt(j)=='#')
                    break;
                else if(str[i].charAt(j)=='.'){
                    S-=2;
                }
                else if(str[i].charAt(j)=='*'){
                    S+=5;
                }
                if(S<K){
                    canEscape=false;
                    break;
                }
            }
            if(!canEscape)
                break;
        }
        if(canEscape){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(S);

    }
}
