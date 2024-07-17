package math;

public class No9 {
    public static void main(String[] args) {
        boolean flag = isPalindrome(111);
        System.out.println(flag);
    }

    /*    public static boolean isPalindrome(int x) {
            String xStr=x+"";
            String y="";
            for (int i = xStr.length()-1; i>=0; i--) {
                y+=xStr.charAt(i);
            }
            if(xStr.equals(y)){
                return true;
            }else {
                return false;
            }
        }*/
    //双指针
    /*public static boolean isPalindrome(int x) {
        String xStr=x+"";
        int p=0;
        int q=xStr.length()-1;
        while (p<q){
            if(xStr.charAt(q)!=xStr.charAt(p))
                return false;
            p++;
            q--;
        }
        return true;
    }*/
    public static boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int reverNum=0;
        while (x>reverNum){
            reverNum=reverNum*10+x%10;
            x/=10;
        }
        return x==reverNum||x==reverNum/10;
    }
}
