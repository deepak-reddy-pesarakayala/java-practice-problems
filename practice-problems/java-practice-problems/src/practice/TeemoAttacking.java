package practice;
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries,int duration) {
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++) {
            total+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        if(timeSeries.length>0) {
            total+=duration;
        }
        return total;
    }
    public static void main(String[] args) {
        TeemoAttacking obj=new TeemoAttacking();
        int[] timeSeries={1,4};
        int duration=2;
        System.out.println(obj.findPoisonedDuration(timeSeries,duration));
    }
}