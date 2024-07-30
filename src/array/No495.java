package array;

public class No495 {
    public static void main(String[] args) {
        int time = new No495().findPoisonedDuration(new int[]{1,2}, 2);
        System.out.println(time);
    }
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time=duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if((timeSeries[i]-timeSeries[i-1])>duration){
                time+=duration;
            }else {
                time+=timeSeries[i]-timeSeries[i-1];
            }
        }
        return time;
    }
}
