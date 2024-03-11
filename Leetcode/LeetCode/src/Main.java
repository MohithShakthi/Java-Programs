import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int k=516;
        int[] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        double sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];
        }
        sum=sum+k;
        System.out.println(sum);
        ArrayList<Integer> l=new ArrayList<>();
        int n=(int)Math.log10(sum)+1;
        for(int i=n-1;i>=0;i--){
            int r=(int)(sum%10.0);
            sum=sum/10.0;
            l.add(0,r);
        }
        System.out.println(l);
    }
}