import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={4,6,7,7};
        for(int i:arr) {
            System.out.println(i);//here num represents the array element
        }
        System.out.println(Arrays.toString(arr));
        String[] name=new String[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            name[i]=input.next();
        }
        System.out.println(Arrays.toString(name));
    }
}