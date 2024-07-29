package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class No1732 {
    public static void main(String[] args) {
        int high = new No1732().largestAltitude(new int[]{-5, 1, 5, 0, -7});
        System.out.println(high);
    }
    public int largestAltitude(int[] gain) {
        int high[]=new int[gain.length+1];
        high[0]=0;
        int max=high[0];
        for (int i = 1; i < high.length; i++) {
            high[i]=high[i-1]+gain[i-1];
            max=max>high[i]?max:high[i];
        }
        return max;
    }
}
