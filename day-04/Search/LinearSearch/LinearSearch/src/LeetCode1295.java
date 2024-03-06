import java.lang.Math.*;
public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums={1234,23,555,777,999};
        int a=find(nums);
        System.out.println(a);
    }
    static int find(int[] arr){
        int c=0,d=0;
        for(int i=0;i<arr.length;i++){
            d=(int)Math.log10(arr[i])+1;
            if(d%2==0){
                c++;
            }
        }
        return c;
    }
}
