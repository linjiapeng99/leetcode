package array;

public class lcp01 {
    public int game(int[] guess, int[] answer) {
        int count=0;
        for (int i = 0; i < guess.length; i++) {
            if(guess[i]==answer[i])
                count++;
        }
        return count;
    }
}
