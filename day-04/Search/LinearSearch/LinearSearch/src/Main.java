public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 723, 8435, 56, 43, 7576};
        int key = 4;
        int ans = LinearSearch(nums, key);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}