package practice;
public class AndroidUnlockPatterns {
    int[][] skip = new int[10][10];
    boolean[] used = new boolean[10];
    public int numberOfPatterns(int m, int n) {
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = 5;
        skip[3][7] = skip[7][3] = 5;
        skip[4][6] = skip[6][4] = 5;
        skip[2][8] = skip[8][2] = 5;
        int answer = 0;
        for (int length = m; length <= n; length++) {
            answer += dfs(1, length - 1);
            answer += dfs(2, length - 1) * 4;
            answer += dfs(5, length - 1);
        }
        return answer;
    }
    private int dfs(int current, int remaining) {
        if (remaining == 0) {
            return 1;
        }
        used[current] = true;
        int count = 0;
        for (int next = 1; next <= 9; next++) {
            if (!used[next]) {
                int middle = skip[current][next];
                if (middle == 0 || used[middle]) {
                    count += dfs(next, remaining - 1);
                }
            }
        }
        used[current] = false;
        return count;
    }
    public static void main(String[] args) {
        AndroidUnlockPatterns obj =
                new AndroidUnlockPatterns();
        System.out.println(obj.numberOfPatterns(1, 1));
        System.out.println(obj.numberOfPatterns(1, 2));
    }
}