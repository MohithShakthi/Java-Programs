import java.io.*;
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("nunber is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
