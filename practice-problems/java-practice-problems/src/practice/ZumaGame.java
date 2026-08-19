package practice;
import java.util.*;
public class ZumaGame {
    Map<String,Integer> memo=new HashMap<>();
    public int findMinStep(String board,String hand) {
        int[] count=new int[26];
        for(char c:hand.toCharArray()) count[c-'A']++;
        int ans=dfs(board,count);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    private int dfs(String board,int[] count) {
        if(board.length()==0) return 0;
        String key=board+Arrays.toString(count);
        if(memo.containsKey(key)) return memo.get(key);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<board.length();i++) {
            int j=i;
            while(j<board.length()&&board.charAt(j)==board.charAt(i)) j++;
            int need=3-(j-i);
            if(need<=0) {
                int result=dfs(board.substring(0,i)+board.substring(j),count);
                if(result!=Integer.MAX_VALUE) ans=Math.min(ans,result);
            } else if(count[board.charAt(i)-'A']>=need) {
                count[board.charAt(i)-'A']-=need;
                String next=board.substring(0,i)+board.substring(j);
                int result=dfs(next,count);
                if(result!=Integer.MAX_VALUE) ans=Math.min(ans,need+result);
                count[board.charAt(i)-'A']+=need;
            }
        }
        memo.put(key,ans);
        return ans;
    }
    public static void main(String[] args) {
        ZumaGame obj=new ZumaGame();
        System.out.println(obj.findMinStep("WRRBBW","RB"));
    }
}