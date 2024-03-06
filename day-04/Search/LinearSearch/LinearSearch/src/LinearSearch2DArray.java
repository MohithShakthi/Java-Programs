public class LinearSearch2DArray {
    public static void main(String[] args) {
        int key=2;
        int ans=-1;
        int[][] nums={{564,9842,8753},
                {652,8972,32,3321},
                {212,434}};
        for(int row=0;row< nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                if(nums[row][col]==key){
                    ans=1;
                }
            }
        }
        System.out.println(ans);
    }
}
