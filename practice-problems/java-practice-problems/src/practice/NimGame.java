package practice;
public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        NimGame obj = new NimGame();
        System.out.println(obj.canWinNim(4));
        System.out.println(obj.canWinNim(5));
    }
}