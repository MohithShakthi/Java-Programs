import java.util.ArrayList;
public class ArrayLIstExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(234);
        list.add(853);
        list.add(356);
        list.add(683);
        list.add(768);
        System.out.println(list);
        System.out.println(list.contains(234));
        System.out.println(list.contains(999));
        list.set(2,666);
        System.out.println(list);
        //to get an item list[i] WILL NOT WORK!! USE list.get(i)
        System.out.println(list.get(2));
    }
}
