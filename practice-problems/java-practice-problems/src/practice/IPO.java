package practice;
import java.util.*;
public class IPO {
    public int findMaximizedCapital(int k,int w,int[] profits,int[] capital) {
        int n=profits.length;
        int[][] projects=new int[n][2];
        for(int i=0;i<n;i++) {
            projects[i][0]=capital[i];
            projects[i][1]=profits[i];
        }
        Arrays.sort(projects,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int j=0;j<k;j++) {
            while(i<n&&projects[i][0]<=w) {
                pq.offer(projects[i][1]);
                i++;
            }
            if(pq.isEmpty()) break;
            w+=pq.poll();
        }
        return w;
    }
    public static void main(String[] args) {
        IPO obj=new IPO();
        int k=2;
        int w=0;
        int[] profits={1,2,3};
        int[] capital={0,1,1};
        System.out.println(obj.findMaximizedCapital(k,w,profits,capital));
    }
}