package practice;
import java.util.*;
public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++) index[i]=i;
        Arrays.sort(index,(a,b)->score[b]-score[a]);
        String[] result=new String[n];
        for(int i=0;i<n;i++) {
            if(i==0) result[index[i]]="Gold Medal";
            else if(i==1) result[index[i]]="Silver Medal";
            else if(i==2) result[index[i]]="Bronze Medal";
            else result[index[i]]=String.valueOf(i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        RelativeRanks obj=new RelativeRanks();
        int[] score={10,3,8,9,4};
        System.out.println(Arrays.toString(obj.findRelativeRanks(score)));
    }
}