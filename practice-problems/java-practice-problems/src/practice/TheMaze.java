package practice;
import java.util.*;
public class TheMaze {
    public boolean hasPath(int[][] maze,int[] start,int[] destination) {
        int m=maze.length;
        int n=maze[0].length;
        boolean[][] visited=new boolean[m][n];
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(start);
        visited[start[0]][start[1]]=true;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()) {
            int[] current=queue.poll();
            if(current[0]==destination[0]&&current[1]==destination[1]) {
                return true;
            }
            for(int[] direction:directions) {
                int r=current[0];
                int c=current[1];
                while(r+direction[0]>=0&&r+direction[0]<m&&c+direction[1]>=0&&c+direction[1]<n&&maze[r+direction[0]][c+direction[1]]==0) {
                    r+=direction[0];
                    c+=direction[1];
                }
                if(!visited[r][c]) {
                    visited[r][c]=true;
                    queue.offer(new int[]{r,c});
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TheMaze obj=new TheMaze();
        int[][] maze={
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}
        };
        int[] start={0,4};
        int[] destination={4,4};
        System.out.println(obj.hasPath(maze,start,destination));
    }
}