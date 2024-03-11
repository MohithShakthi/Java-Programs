import java.util.ArrayList;
public class LeetCode989 {
    public static void main(String[] args) {
        int k = 516;
        int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        ArrayList<Integer> l = new ArrayList<>();
        int n = num.length;
        for (int i = n-1; i>=0; i--) {
            int sum = num[i] + k;
            int r = sum % 10;
            k = sum / 10;
            l.add(0,r);
        }
        if(k!=0){
            l.add(0,k);
        }
        System.out.println(l);
    }
}
