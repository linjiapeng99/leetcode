package math;

import java.util.ArrayList;
import java.util.List;

public class No728 {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(47, 85);
        System.out.println(list);
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for (int i = left; i <=right; i++) {
            if (selfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }
    private static boolean selfDividingNumber(int n){
        int x;
        int y=n;
        while (y > 0) {
            x=y%10;
            if(x==0||n%x!=0){
                return false;
            }
            y=y/10;
        }
        return true;
    }
}
