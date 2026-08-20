package practice;
import java.util.*;
public class FreedomTrail {
    public int findRotateSteps(String ring,String key) {
        Map<String,Integer> memo=new HashMap<>();
        return solve(ring,key,0,0,memo);
    }
    private int solve(String ring,String key,int ringPos,int keyPos,Map<String,Integer> memo) {
        if(keyPos==key.length()) return 0;
        String state=ringPos+","+keyPos;
        if(memo.containsKey(state)) return memo.get(state);
        int n=ring.length();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(ring.charAt(i)==key.charAt(keyPos)) {
                int distance=Math.abs(i-ringPos);
                int rotate=Math.min(distance,n-distance);
                int result=rotate+1+solve(ring,key,i,keyPos+1,memo);
                ans=Math.min(ans,result);
            }
        }
        memo.put(state,ans);
        return ans;
    }
    public static void main(String[] args) {
        FreedomTrail obj=new FreedomTrail();
        System.out.println(obj.findRotateSteps("godding","gd"));
    }
}