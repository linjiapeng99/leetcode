package array;

public class No2496 {
    public static void main(String[] args) {
        String[]arr=new String[]{"i49sx86t2","270","a","a","5xfy2ma","54530417","q7kyk","q5lqhcx9","izif","30130506","9802","d2qlm1","643","rpvvl2","vnakvpk","v","95147099","6o","qar0o","sm","59554","5kus31vrs","e06i5zuu","ef","ss","5","970","04","gash","2496467","71058805","55271","1pam","f","j0m","83","ammd878l","73","702","d9x9a1b0z","dp57","gt5kzk553","jwrft","xxm07i96","13198207","09155","0698594","zpwo9"};
        int count = new No2496().maximumValue(arr);
        System.out.println(count);
    }
    public int maximumValue(String[] strs) {
        int count=0;
        for (int i = 0; i < strs.length; i++) {
            int strNum = strNum(strs[i]);
            count=strNum>count?strNum:count;
        }
        return count;
    }
    private int strNum(String str){
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                return str.length();
            }
        }
        return Integer.parseInt(str);
    }
}
