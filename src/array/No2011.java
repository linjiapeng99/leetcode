package array;

public class No2011 {
    public static void main(String[] args) {
        String operations[]={"x++","x++","x++"};
        int end = finalValueAfterOperations(operations);
        System.out.println(end);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("-")){
                x--;
            } else if (operations[i].contains("+")) {
                x++;
            }
        }
        return x;
    }
}
