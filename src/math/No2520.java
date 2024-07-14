package math;

public class No2520 {
    public static void main(String[] args) {
        int i = countDigits2(1248);
        System.out.println(i);
    }
    public static int countDigits1(int num) {
        int count=0;
        String numStr=num+"";
        for (int i = 0; i < numStr.length(); i++) {
            if(num%Integer.parseInt(numStr.charAt(i)+"")==0){
                count++;
            }
        }
        return count;
    }
    public static int countDigits2(int num) {
        int count=0;
        String numStr=num+"";
        for (int i = 0; i < numStr.length(); i++) {
            if(num%(numStr.charAt(i)-'0')==0){
                count++;
            }
        }
        return count;
    }
}
