package math;

import java.util.Map;

public class No372 {
    public static void main(String[] args) {
        int i = superPow(2147483647, new int[]{2,0, 0});
        System.out.println(i);
    }
    public static int superPow(int a, int[] b) {
        int ret=1;
        for (int i = 0; i < b.length; i++) {
            ret=pow_while_mod1337(ret,10)*pow_while_mod1337(a,b[i]);
            ret%=1337;
        }
        return ret;
    }
    private static int pow_while_mod1337(int a,int b){
        if(b==0){
            return 1;
        }
        int ret=1;
        while (b>=1){
            ret*=(a%1337);
            ret%=1337;
            b--;
        }
        return ret;
    }

}
