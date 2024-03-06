import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] arr={1,7,9,0,5};
        System.out.println(Arrays.toString(arr));
        altered(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void altered(int[] nums){
        nums[2]=1234;
    }
}
