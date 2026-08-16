package practice;
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int row = 1;
        while (n >= row) {
            n = n - row;
            row++;
        }
        return row - 1;
    }
    public static void main(String[] args) {
        ArrangingCoins obj = new ArrangingCoins();
        System.out.println(obj.arrangeCoins(5));
    }
}