import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class Two2Darray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("The the number of rows is:"+arr.length);
        System.out.println("Enter the array elements:");
        for(int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        for(int r=0;r<arr.length;r++){
            System.out.println(Arrays.toString(arr[r]));
        }
        int[][] nums={{1,2,3},
                {4,5,6,7},
                {8,9}};
        for(int[] a:nums){
            System.out.println(Arrays.toString(a));
        }
        String[][] name={{"mo","kp","sa"},
                {"ai","ssv"}};
        for(String[] e:name){
            System.out.println(Arrays.toString(e));
        }
    }
}
