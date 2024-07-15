package math;

import java.util.ArrayList;
import java.util.List;

public class No2427 {
    public static void main(String[] args) {
        int a = commonFactors(1,1);
        System.out.println(a);
    }
    public static int commonFactors(int a, int b) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        if(a!=1){
            arr.add(a);
        }
        List<Integer> brr=new ArrayList<>();
        brr.add(1);
        if(b!=1){
            brr.add(b);
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                arr.add(i);
            }
        }
        for(int i=2;i<=b/2;i++){
            if(b%i==0){
                brr.add(i);
            }
        }
        //System.out.println(arr);
        //System.out.println(brr);
        List crr=new ArrayList();
        for (Object o : arr) {
            if(brr.contains(o))
                crr.add(o);
        }
        //System.out.println(crr);
        return crr.size();
    }
}
