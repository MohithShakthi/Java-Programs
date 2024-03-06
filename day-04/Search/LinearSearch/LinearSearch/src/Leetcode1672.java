public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{3,2,1}};
        int r=richest(nums);
        System.out.println(r);

    }
    static int richest(int[][] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>c){
                c=sum;
            }
        }
        return c;
    }
}
