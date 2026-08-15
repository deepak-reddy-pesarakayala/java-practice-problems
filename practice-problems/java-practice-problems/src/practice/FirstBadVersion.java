package practice;
public class FirstBadVersion {
    static int badVersion = 4;
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
    public static void main(String[] args) {
        FirstBadVersion obj = new FirstBadVersion();
        System.out.println(obj.firstBadVersion(7));
    }
}