import java.io.*;
import java.util.Scanner;
public class Largest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the 3 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a:"+a+" is largest");
            }
            else{
                System.out.println("c:"+c+" is largest");
            }
        }
        else if (b>c){
            System.out.println("b:"+b+" is largest");
        }
        else{
            System.out.println("c:"+c+" is largest");
        }
        //
        if(a<b){
            if(a<c){
                System.out.println("a:"+a+" is smallest");
            }
            else{
                System.out.println("c:"+c+" is smallest");
            }
        }
        else if (b<c){
            System.out.println("b:"+b+" is smallest");
        }
        else{
            System.out.println("c:"+c+" is smallest");
        }
    }
}
