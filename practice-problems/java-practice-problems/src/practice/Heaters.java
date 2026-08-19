package practice;
import java.util.*;
public class Heaters {
    public int findRadius(int[] houses,int[] heaters) {
        Arrays.sort(heaters);
        int radius=0;
        for(int house:houses) {
            int left=0;
            int right=heaters.length-1;
            int minDistance=Integer.MAX_VALUE;
            while(left<=right) {
                int mid=left+(right-left)/2;
                minDistance=Math.min(minDistance,Math.abs(house-heaters[mid]));
                if(heaters[mid]<house) {
                    left=mid+1;
                } else {
                    right=mid-1;
                }
            }
            radius=Math.max(radius,minDistance);
        }
        return radius;
    }
    public static void main(String[] args) {
        Heaters obj=new Heaters();
        int[] houses={1,2,3,4};
        int[] heaters={1,4};
        System.out.println(obj.findRadius(houses,heaters));
    }
}