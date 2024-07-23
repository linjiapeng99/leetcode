package array;

import java.util.Arrays;

public class No1720 {
    public static void main(String[] args) {
        int[] newArr = new No1720().decode(new int[]{1, 2, 3}, 1);
        System.out.println(Arrays.toString(newArr));
    }

    /*    public int[] decode(int[] encoded, int first) {
            int newArr[]=new int[encoded.length-1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i]=encoded[i]^encoded[i+1];
            }
            return newArr;
        }*/
    public int[] decode(int[] encoded, int first) {
        int newArr[] = new int[encoded.length + 1];
        newArr[0] = first;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = newArr[i - 1] ^ encoded[i - 1];
        }
        return newArr;
    }
}
