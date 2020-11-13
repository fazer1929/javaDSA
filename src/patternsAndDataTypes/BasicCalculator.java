package patternsAndDataTypes;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = ' ';
        char oper = ' ';
        boolean operation= true;
        int count = 0,num1=0,num2=0;

        do{
            ch= scan.next().charAt(0);
            if(operation){
                if(ch=='+' || ch=='-' || ch=='*' || ch=='%' || ch=='/'){
                    operation = false;
                    oper = ch;
                }
                else if(ch!='x' && ch!='X'){
                    System.out.println("Invalid operation. Try again.");
                    continue;
                }
            }else{
                if(ch>='0' && ch<='9'){
                    count++;
                    if(count == 1) num1= Integer.parseInt(Character.toString(ch));
                    else if(count==2) num2 = Integer.parseInt(Character.toString(ch));
                }
                else if(ch!='x' && ch!='X'){
                    System.out.println("Invalid operation. Try again.");
                    continue;
                }
            }
            if(count==2){
                switch (oper){
                    case '+': System.out.println(num1+num2);
                    count=0;
                    operation=true;
                    break;
                    case '-': System.out.println(num1-num2);
                        count=0;
                        operation=true;
                        break;
                    case '*': System.out.println(num1*num2);
                        count=0;
                        operation=true;
                        break;
                    case '/': System.out.println(num1/num2);
                        count=0;
                        operation=true;
                        break;
                    case '%': System.out.println(num1%num2);
                        count=0;
                        operation=true;
                        break;
                }
            }
        }while (ch!= 'x' && ch != 'X');
    }
}
